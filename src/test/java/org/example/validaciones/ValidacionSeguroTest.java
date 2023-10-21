package org.example.validaciones;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ValidacionSeguroTest
{
    ValidacionSeguro validacionSeguro;

    @BeforeEach
    public void testPrueba()
    {
        this.validacionSeguro = new ValidacionSeguro();
    }

    @Test
    void validarNombreAseguradoCorrecto()
    {
        String nombreP = "Boris Fernandez";
        Boolean resultado = assertDoesNotThrow(() -> this.validacionSeguro.validarNombreAsegurado(nombreP));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void validarNombreAseguradoInCorrecto()
    {
        String nombreP = "Boris Fernandez12";
        Exception resultado = Assertions.assertThrows(Exception.class, () -> this.validacionSeguro.validarNombreAsegurado(nombreP));
        Assertions.assertEquals("El nombre asegurado es incorrecto", resultado.getMessage());
    }

        @Test
    void validarEdadAsegurado() {
    }

    @Test
    void validarBeneficiario() {
    }

    @Test
    void validarMontoCobertura() {
    }

    @Test
    void fechaInicioCobertura() {
    }
}