package curso;

import org.junit.Assert;
import org.junit.Test;

public class CadenaTest {

    @Test
    public void debeConverirALetraCapital() {

        // inicializar
        String palabra = "bomberos";
        CadenaUtils cad = new CadenaUtils();
        // operar
        String resultado = cad.aLetraCapital(palabra);
        // verificar
        Assert.assertEquals("Bomberos", resultado);
    }

    @Test
    public void debeInvertirPalabra() {

        // Inicializar
        String palabra = "Softtek";
        CadenaUtils cad = new CadenaUtils();
        // operar
        String resultado = cad.invertir(palabra);
        // Verificar
        Assert.assertEquals("kettfoS", resultado);
    }

    @Test
    public void debeVerificarSiTieneNumeros() {

        // Inicializar
        String palabra = "H0l4 Mund0";
        String palabra2 = "Hola Mundo";
        CadenaUtils cad = new CadenaUtils();
        // Operar
        boolean ind = cad.hayNumeros(palabra);
        boolean ind2 = cad.hayNumeros(palabra2);
        // Verificar
        Assert.assertEquals(true, ind);
        Assert.assertEquals(false, ind2);
    }

    @Test
    public void debeEnmascarar() {

        // Inicializar
        String mask = "XX0-XXX-0000-XXXX";
        String palabra = "123-885-1309-1234";
        CadenaUtils cad = new CadenaUtils();
        // Operar
        String resultado = cad.mask(mask, palabra);
        // Verificar
        Assert.assertEquals("XX3-XXX-1309-XXXX", resultado);
    }

}
