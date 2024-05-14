package com.sdu.foodorderingsystem.authmodels;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class LogInModel {
	
	@Id
	@NotNull
	private Integer userId;
	private String userName;
	private String password;

}
