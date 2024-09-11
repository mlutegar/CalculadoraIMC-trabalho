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

    // Baixo peso1: 17 <= IMC < 18.5 | (55,1, 1.80, 30, "m") = 17
    @Test
    public void testeCalcularImcAdultoBaixoPesoDoNormal1() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(55.1, 1.80, 30, "m"));
    }

    // Baixo peso2: 17 <= IMC < 18.5 | (55.9, 1.80, 30, "m") = 18.5
    @Test
    public void testeCalcularImcAdultoBaixoPesoDoNormal2() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(55.9, 1.80, 30, "m"));
    }

    // Peso normal1: 18.5 <= IMC < 25 | (60, 1.80, 30, "m") = 18.5
    @Test
    public void testeCalcularImcAdultoPesoNormal1() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(60, 1.80, 30, "m"));
    }

    // Peso normal2: 18.5 <= IMC < 25 | (80.9, 1.80, 30, "m") = 24.9
    @Test
    public void testeCalcularImcAdultoPesoNormal2() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(80.9, 1.80, 30, "m"));
    }

    // Sobrepeso1: 25 <= IMC < 30 | (81, 1.80, 30, "m") = 25
    @Test
    public void testeCalcularImcAdultoSobrepeso1() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(81, 1.80, 30, "m"));
    }

    // Sobrepeso2: 25 <= IMC < 30 | (97.1, 1.80, 30, "m") = 29.9
    @Test
    public void testeCalcularImcAdultoSobrepeso2() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(97.1, 1.80, 30, "m"));
    }

    // Obesidade grau I1: 30 <= IMC < 35 | (97.2, 1.80, 30, "m") = 30
    @Test
    public void testeCalcularImcAdultoObesidadeGrauI1() {
        Assert.assertEquals("Obesidade grau I", calcIMC.calcularImc(97.2, 1.80, 30, "m"));
    }

    // Obesidade grau I2: 30 <= IMC < 35 | (113.3, 1.80, 30, "m") = 34.9
    @Test
    public void testeCalcularImcAdultoObesidadeGrauI2() {
        Assert.assertEquals("Obesidade grau I", calcIMC.calcularImc(113.3, 1.80, 30, "m"));
    }

    // Obesidade grau II1: 35 <= IMC < 40 | (113.4, 1.80, 30, "m") = 35
    @Test
    public void testeCalcularImcAdultoObesidadeGrauII1() {
        Assert.assertEquals("Obesidade grau II", calcIMC.calcularImc(113.4, 1.80, 30, "m"));
    }

    // Obesidade grau II2: 35 <= IMC < 40 | (129.5, 1.80, 30, "m") = 39.9
    @Test
    public void testeCalcularImcAdultoObesidadeGrauII2() {
        Assert.assertEquals("Obesidade grau II", calcIMC.calcularImc(129.5, 1.80, 30, "m"));
    }

    // Obesidade grau III (obesidade mórbida): IMC >= 40 | (129.6, 1.80, 30, "m") = 40
    @Test
    public void testeCalcularImcAdultoObesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calcIMC.calcularImc(129.6, 1.80, 30, "m"));
    }

    // VELHOS TESTES (20 no total)

    // CRIANÇAS TESTES (60 no total {5 idades [2,4,6,8,10], 6 classificações e 2 sexos})
}
