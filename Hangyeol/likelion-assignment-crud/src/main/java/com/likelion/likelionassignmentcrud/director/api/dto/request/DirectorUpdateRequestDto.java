package com.likelion.likelionassignmentcrud.director.api.dto.request;

import com.likelion.likelionassignmentcrud.director.domain.Part;

public record DirectorUpdateRequestDto(String name, int age, int debutYear, Part part) {
}
