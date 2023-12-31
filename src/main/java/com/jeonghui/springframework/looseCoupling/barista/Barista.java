package com.jeonghui.springframework.looseCoupling.barista;

import com.jeonghui.springframework.looseCoupling.machine.Machine;
import com.jeonghui.springframework.looseCoupling.material.DrinkMaterial;

public interface Barista {
	public void makeDrink();
	public void setMachine(Machine machine);
	public void setDrinkMaterial(DrinkMaterial material);
}
