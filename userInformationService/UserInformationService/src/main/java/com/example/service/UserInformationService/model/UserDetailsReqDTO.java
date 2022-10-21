package com.example.service.UserInformationService.model;


import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UserDetailsReqDTO {
    

    private Integer detailId;
   // private LocalDate date;
    private String name;
    private String email;
    private String password;
   // List<ClassOrProgOrExInfoDTO> classOrExerciseInfoList=new LinkedList<>();

    @Override
    public String toString() {
        return "WorkoutBuilderRequestDTO{" +
                "detailId=" + detailId +
                ", name=" + name +
                  ", email=" + email +
                    ", password=" + password +
                
               // ", classOrExerciseInfoList=" + classOrExerciseInfoList +
                '}';
    }


}
