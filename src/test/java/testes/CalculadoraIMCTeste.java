package testes;

import control.CalculadoraIMC;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraIMCTeste {

    // Declaração de variáveis
    CalculadoraIMC calcIMC;

    // setup: método que executa antes de cada teste
    @Before
    public void setup() {
        System.out.println("Iniciando teste...");
        calcIMC = new CalculadoraIMC();
    }

    // teardown: método que executa após cada teste
    @After
    public void teardown() {
        System.out.println("Teste finalizado.");
        calcIMC = null;
    }

    // ADULTOS TESTES (14 no total)
    // Baixo peso muito grave: IMC < 16 | (40, 1.80, 30, "m") = 12.3
    @Test
    public void testeCalcularImcAdultoPesoMuitoGrave() {
        Assert.assertEquals("Baixo peso muito grave", calcIMC.calcularImc(40, 1.80, 30, "m"));
    }

    // Baixo peso grave 1: 16 <= IMC < 17 | (51.9, 1.80, 30, "m") = 16
    @Test
    public void testeCalcularImcAdultoPesoGrave1() {
        Assert.assertEquals("Baixo peso grave", calcIMC.calcularImc(51.9, 1.80, 30, "m"));
    }

    // Baixo peso grave 2: 16 <= IMC < 17 | (55, 1.80, 30, "m") = 16,9
    @Test
    public void testeCalcularImcAdultoPesoGrave2() {
        Assert.assertEquals("Baixo peso grave", calcIMC.calcularImc(55, 1.80, 30, "m"));
    }


    @Test
    public void testeCalcularImcAdultoPesoAbaixoDoNormal() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(55, 1.80, 30, "m"));
    }

    @Test
    public void testeCalcularImcAdultoPesoNormal() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(70, 1.80, 30, "m"));
    }

    // testeCalcularImcAdultoMasculinoPesoAbaixoDoNormal: testa o método calcularImc da classe CalculadoraIMC para um adulto do sexo masculino com peso abaixo do normal

    // VELHOS TESTES (20 no total)

    // CRIANÇAS TESTES (60 no total {5 idades [2,4,6,8,10], 6 classificações e 2 sexos})
}
