package com.codegym.service.impl;

import com.codegym.model.MailConfig;
import com.codegym.repository.IMailConfigRepository;
import com.codegym.service.IMailConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MailConfigService implements IMailConfigService {
    @Autowired
    private IMailConfigRepository mailConfigRepository;

    @Override
    public List<MailConfig> getAll() {
        return mailConfigRepository.getAll();
    }

    @Override
    public MailConfig getById(int id) {
        return mailConfigRepository.getById(id);
    }

    @Override
    public MailConfig edit(MailConfig mailConfig) {
        return mailConfigRepository.edit(mailConfig);
    }

    @Override
    public List<String> languages() {
        return mailConfigRepository.languages();
    }

    @Override
    public List<Integer> pageSizes() {
        return mailConfigRepository.pageSizes();
    }
}
