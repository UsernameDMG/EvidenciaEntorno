package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.CuentaBancaria;

class Pruebas {

	CuentaBancaria cb = new CuentaBancaria();

	@Test
	void test() throws Exception{
		CuentaBancaria CB = new CuentaBancaria();
		CB.agregarSaldo(2000);
		CB.modificarCredito(1000);
		assertEquals(2000, CB.obtenerSaldo());
	}
	
	@Test
	void test1() throws Exception{
		CuentaBancaria CB = new CuentaBancaria();
		CB.modificarCredito(900);
		CB.retirarSaldo(500);
		assertEquals(-500, CB.obtenerSaldo());
	}
	
	@Test
	void test2() throws Exception{
		CuentaBancaria CB = new CuentaBancaria();
		CB.modificarCredito(1000);
		CB.retirarSaldo(800);
		assertThrows(Exception.class, () -> CB.modificarCredito(500));
	}

}
