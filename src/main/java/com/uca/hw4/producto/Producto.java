package com.uca.hw4.producto;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {
	@NotEmpty(message = "Rellena el campo para continuar")
	@Size(min = 12, max = 12, message = "El codigo de producto debe ser no mas ni menos que de 12 caracteres de longitud")
	private String codProduct;
	
	@NotEmpty(message = "Rellena el campo para continuar")
	@Size(min = 1, max = 100, message = "El nombre del producto debe ser de maximo 100 caractares de longitud y minimo 1")
	private String nomProduct;
	
	@NotEmpty(message = "Rellena el campo para continuar")
	@Size(min = 1, max = 100, message = "La marca del producto debe ser de maximo 100 caractares de longitud y minimo 1")
	private String marca;
	
	@NotEmpty(message = "Rellena el campo para continuar")
	@Size(min = 1, max = 500, message = "La descripcion del producto debe ser de maximo 500 caractares de longitud y minimo 1")
	private String desc;
	
	@NotEmpty(message = "Rellena el campo para continuar")
	@Digits(integer = 10, fraction = 0, message="El valor de productos en existencia debe ser entero... Los productos no estan fraccionados")
	private String enExist;
	
	@NotEmpty(message = "Rellena el campo para continuar")
	@Pattern(regexp = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$", message = "Fecha en formato dd/mm/yyyy")
	private String ingreso;
}
