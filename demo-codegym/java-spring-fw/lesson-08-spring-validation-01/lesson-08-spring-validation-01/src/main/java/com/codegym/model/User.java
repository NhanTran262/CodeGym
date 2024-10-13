package com.codegym.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @NotEmpty(message = "Hông để trống bé ơi!")
    @Size(min = 2, max = 30, message = "Độ dài cho phép 2->30 ký tự thui nha!")
    private String name;

    @Min(18)
    private int age;
}