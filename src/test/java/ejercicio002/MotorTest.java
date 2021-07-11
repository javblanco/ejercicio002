package ejercicio002;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MotorTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testMotor() {
		Motor motorNuevo = new Motor();
		
		if ( motorNuevo.getPotenciaInicial() < 40 && motorNuevo.getPotenciaInicial() > 20 ) {
			assertEquals(true, true, "Motor creado con exito");
		} else {
			assertEquals(true, false, "Motor creado sin exito");
		}
	}

}
