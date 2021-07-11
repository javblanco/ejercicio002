package ejercicio002;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CocheTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void crearCoche() {
		Coche cocheNuevo = new Coche();
		assertEquals(cocheNuevo.getPotenciaFinal(), 3, "Algo ha ido mal");
	}

}
