package com.codegym.service;

import com.codegym.model.MedicalDeclaration;

import java.util.List;

public interface IMedicalDeclarationService {
    List<MedicalDeclaration> getAll();

    MedicalDeclaration getById(int id);

    MedicalDeclaration edit(MedicalDeclaration medicalDeclaration);

    List<String> dates();

    List<String> genders();

    List<String> countrys();

    List<String> travelInfo();
}
