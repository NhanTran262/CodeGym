package com.codegym.repository;

import com.codegym.model.MailConfig;

import java.util.List;

public interface IMailConfigRepository {
    List<MailConfig> getAll();

    MailConfig getById(int id);

    MailConfig edit(MailConfig mailConfig);

    List<String> languages();

    List<Integer> pageSizes();
}
