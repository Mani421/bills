package Paytm.app.service.impl;

import cn.hyperchain.sdk.account.Account;
import cn.hyperchain.sdk.transaction.Transaction;
import Paytm.app.base.constant.Code;
import Paytm.app.base.exceptions.DeployException;
import Paytm.app.repository.ContractRepository;
import Paytm.app.service.ContractService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author: chenquan
 * Date: 2018/11/12
 * Package: Paytm.app.service.impl
 * Description:
 */
@Service
public class ContractServiceImpl implements ContractService {
    @Autowired
    ContractRepository contractRepository;

    @Override public String delpoy(String contractName) {
        String payload = null;
        try {
            Account account = new Account(contractRepository.queryAccountJson(""));
            Transaction deployTx = new Transaction.HVMBuilder(account.getAddress()).deploy("contract/" + contractRepository.queryContractJarName()).build();
            return contractRepository.deploy(deployTx, contractName, false);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DeployException(Code.DEPLOY_FAILED, e.getMessage());
        }
    }
}
