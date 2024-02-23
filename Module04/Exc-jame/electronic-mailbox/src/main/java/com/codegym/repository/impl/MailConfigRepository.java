package com.codegym.repository.impl;

import com.codegym.model.MailConfig;
import com.codegym.repository.IMailConfigRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MailConfigRepository implements IMailConfigRepository {
    private static final List<MailConfig> mailConfigs = new ArrayList<>();

    static {
        mailConfigs.add(new MailConfig(1, "English", 5, false, "OK"));
        mailConfigs.add(new MailConfig(2, "Vietnamese", 10, true, "OKie"));
        mailConfigs.add(new MailConfig(3, "Japanese", 15, false, "OKla"));
        mailConfigs.add(new MailConfig(4, "English", 25, true, "OK"));
        mailConfigs.add(new MailConfig(5, "English", 25, true, "OK"));
    }

    @Override
    public List<MailConfig> getAll() {
        return mailConfigs;
    }

    @Override
    public MailConfig getById(int id) {
        return mailConfigs.get(id);
    }

    @Override
    public MailConfig edit(MailConfig mailConfig) {
        MailConfig mail = getById(mailConfig.getId());
        mail.setLanguage(mailConfig.getLanguage());
        mail.setPageSize(mailConfig.getPageSize());
        mail.setSpamFilter(mailConfig.isSpamFilter());
        mail.setSignature(mailConfig.getSignature());
        return null;
    }

    @Override
    public List<String> languages() {
        List<String> languages = new ArrayList<>();
        languages.add("English");
        languages.add("Vietnamese");
        languages.add("Japanese");
        languages.add("Chinese");

        return languages;
    }

    @Override
    public List<Integer> pageSizes() {
        List<Integer> pageSizes = new ArrayList<>();
        pageSizes.add(5);
        pageSizes.add(10);
        pageSizes.add(15);
        pageSizes.add(25);
        pageSizes.add(50);
        pageSizes.add(100);
        return pageSizes;
    }
}
