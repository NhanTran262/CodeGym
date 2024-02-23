package com.codegym.service;

import com.codegym.model.MailConfig;

import java.util.List;

public interface IMailConfigService {
    List<MailConfig> getAll();

    MailConfig getById(int id);

    MailConfig edit(MailConfig mailConfig);

    List<String> languages();

    List<Integer> pageSizes();
}
