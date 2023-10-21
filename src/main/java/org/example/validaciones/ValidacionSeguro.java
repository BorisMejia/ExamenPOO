package org.example.validaciones;

import org.example.utilidad.Utilidades;

public class ValidacionSeguro
{
    Utilidades utilidades = new Utilidades();

    public ValidacionSeguro()
    {

    }
    public boolean validarNombreAsegurado(String nombreAsegurado) throws Exception
    {
        if (nombreAsegurado.length() <1 || nombreAsegurado.length()>=20)
        {
            throw new Exception("El numero de caracteres debe tener una longitud maxima de 20 caracteres");
        }
        String expresionRegular = "^[a-zA-Z ]+$";
        if (!this.utilidades.buscarCoincidencia(expresionRegular, nombreAsegurado))
        {
            throw new Exception("El nombre no cumple los parametros");
        }
        return true;
    }
    public  boolean validarEdadAsegurado(int edadAsegurdo) throws Exception
    {
        if (edadAsegurdo <0 || edadAsegurdo >90)
        {
            throw  new Exception("Recuerde que para asegurarse debe ser menor a 90 años y haber nacido");
        }
        String edadAseguradoS = Integer.toString(edadAsegurdo);
        String expresionRegular = "^[0-9]+$";
        if (!this.utilidades.buscarCoincidencia(expresionRegular,edadAseguradoS ))
        {
            throw  new Exception("La edad ingresada no es correcta");
        }
        return true;
    }
    public boolean validarBeneficiario(String beneficiario) throws Exception
    {
        if (beneficiario.length() <0 || beneficiario.length() >=50)
        {
            throw new Exception("El beneficiario debe tener un maximo de 50 caracteres contando espacios");
        }
        String expresionRegular = "^[a-zA-Z ]+$";
        if (!this.utilidades.buscarCoincidencia(expresionRegular,beneficiario))
        {
            throw new Exception("Los caracteres ingresados no son validos");
        }
        return true;
    }
    public boolean validarMontoCobertura(double montoCobertura) throws Exception
    {
        if (montoCobertura <=1500000000)
        {
            throw new Exception("El monto maximo de cobertura es de 1500 millones");
        }
        String montoCoberturaS = Double.toString(montoCobertura);
        String expresionRegular = "^[0-9]+$";
        if (!this.utilidades.buscarCoincidencia(expresionRegular, montoCoberturaS))
        {
            throw new Exception("Los carracteres ingresados en el monto de cobertura son incorrectos");
        }
        return true;
    }
    public boolean fechaInicioCobertura(String fecha) throws Exception
    {

        String expresionRegular = "^(0[1-9]|[12][0-9]|3[01)/(0[1-9]|1[0-2])/(\\d{4}+$";
        if (!this.utilidades.buscarCoincidencia(expresionRegular, fecha))
        {
            throw new Exception("Los caracteres ingresados no son correctos");
        }
        return true;
    }

}
