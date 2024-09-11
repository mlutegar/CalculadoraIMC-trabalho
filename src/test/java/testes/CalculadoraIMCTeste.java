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

    // VELHO MASCULINO

    // Baixo peso: IMC < 21.9 | (70.6, 1.80, 70, "m") = 21.8
    @Test
    public void testeCalcularImcVelhoMasculinoBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(70.6, 1.80, 70, "m"));
    }

    // Peso normal1: 22 <= IMC <= 27 | (71.3, 1.80, 70, "m") = 22
    @Test
    public void testeCalcularImcVelhoMasculinoPesoNormal1() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(71.3, 1.80, 70, "m"));
    }

    // Peso normal2: 22 <= IMC <= 27 | (87,5, 1.80, 70, "m") = 27
    @Test
    public void testeCalcularImcVelhoMasculinoPesoNormal2() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(87.5, 1.80, 70, "m"));
    }

    // Sobrepeso1: 27 < IMC <= 30 | (87.6, 1.80, 70, "m") = 27.1
    @Test
    public void testeCalcularImcVelhoMasculinoSobrepeso1() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(87.6, 1.80, 70, "m"));
    }

    // Sobrepeso2: 27 < IMC <= 30 | (97,2, 1.80, 70, "m") = 30
    @Test
    public void testeCalcularImcVelhoMasculinoSobrepeso2() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(97.2, 1.80, 70, "m"));
    }

    // Obesidade grau I1: 30 < IMC <= 35 | (97.3, 1.80, 70, "m") = 30.01
    @Test
    public void testeCalcularImcVelhoMasculinoObesidadeGrauI1() {
        Assert.assertEquals("Obesidade grau I", calcIMC.calcularImc(97.3, 1.80, 70, "m"));
    }

    // Obesidade grau I2: 30 < IMC <= 35 | (113.4, 1.80, 70, "m") = 34.9
    @Test
    public void testeCalcularImcVelhoMasculinoObesidadeGrauI2() {
        Assert.assertEquals("Obesidade grau I", calcIMC.calcularImc(113.4, 1.80, 70, "m"));
    }

    // Obesidade grau II1: 35 < IMC <= 39.9 | (113.8, 1.80, 70, "m") = 35.03
    @Test
    public void testeCalcularImcVelhoMasculinoObesidadeGrauII1() {
        Assert.assertEquals("Obesidade grau II", calcIMC.calcularImc(113.8, 1.80, 70, "m"));
    }

    // Obesidade grau II2: 35 < IMC <= 39.9 | (129.3, 1.80, 70, "m") = 39.9
    @Test
    public void testeCalcularImcVelhoMasculinoObesidadeGrauII2() {
        Assert.assertEquals("Obesidade grau II", calcIMC.calcularImc(129.3, 1.80, 70, "m"));
    }

    // Obesidade grau III (obesidade mórbida): IMC >= 40 | (130, 1.80, 70, "m") = 40
    @Test
    public void testeCalcularImcVelhoMasculinoObesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calcIMC.calcularImc(130, 1.80, 70, "m"));
    }

    // VELHO FEMININO

    // Baixo peso: IMC < 21.9 | (50, 1.60, 70, "f") = 19.5
    @Test
    public void testeCalcularImcVelhoFemininoBaixoPeso1() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(50, 1.60, 70, "f"));
    }

    // Baixo peso: IMC < 21.9 | (55.9, 1.60, 70, "f") = 21.8
    @Test
    public void testeCalcularImcVelhoFemininoBaixoPeso2() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(55.9, 1.60, 70, "f"));
    }

    // Peso normal1: 22 <= IMC <= 27 | (56.4, 1.60, 70, "f") = 22
    @Test
    public void testeCalcularImcVelhoFemininoPesoNormal1() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(56.4, 1.60, 70, "f"));
    }

    // Peso normal2: 22 <= IMC <= 27 | (69.2, 1.60, 70, "f") = 27
    @Test
    public void testeCalcularImcVelhoFemininoPesoNormal2() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(69.2, 1.60, 70, "f"));
    }

    // Sobrepeso1: 27 < IMC <= 32 | (69.4, 1.60, 70, "f") = 27.1
    @Test
    public void testeCalcularImcVelhoFemininoSobrepeso1() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(69.4, 1.60, 70, "f"));
    }

    // Sobrepeso2: 27 < IMC <= 32 | (82, 1.60, 70, "f") = 32
    @Test
    public void testeCalcularImcVelhoFemininoSobrepeso2() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(82, 1.60, 70, "f"));
    }

    // Obesidade grau I1: 32 < IMC <= 37 | (83, 1.60, 70, "f") = 32.1
    @Test
    public void testeCalcularImcVelhoFemininoObesidadeGrauI1() {
        Assert.assertEquals("Obesidade grau I", calcIMC.calcularImc(83, 1.60, 70, "f"));
    }

    // Obesidade grau I2: 32 < IMC <= 37 | (94.8, 1.60, 70, "f") = 37
    @Test
    public void testeCalcularImcVelhoFemininoObesidadeGrauI2() {
        Assert.assertEquals("Obesidade grau I", calcIMC.calcularImc(94.8, 1.60, 70, "f"));
    }
    // Obesidade grau II1: 37 < IMC <= 41.9 | (95, 1.60, 70, "f") = 37.1
    @Test
    public void testeCalcularImcVelhoFemininoObesidadeGrauII1() {
        Assert.assertEquals("Obesidade grau II", calcIMC.calcularImc(95, 1.60, 70, "f"));
    }

    // Obesidade grau II2: 37 < IMC <= 41.9 | (107.3, 1.60, 70, "f") = 41.9
    @Test
    public void testeCalcularImcVelhoFemininoObesidadeGrauII2() {
        Assert.assertEquals("Obesidade grau II", calcIMC.calcularImc(107.3, 1.60, 70, "f"));
    }

    // Obesidade grau III (obesidade mórbida): IMC >= 42 | (107.6, 1.60, 70, "f") = 42
    @Test
    public void testeCalcularImcVelhoFemininoObesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calcIMC.calcularImc(108, 1.60, 70, "f"));
    }

    // CRIANÇAS TESTES (60 no total {5 idades [2,4,6,8,10], 6 classificações e 2 sexos})

    // CRIANÇA MASCULINO

    // 2 ANOS

    // Baixo peso: IMC < 16 | (12, 0.90, 2, "m") = 14.8
    @Test
    public void testeCalcularImcCriancaMasculino2AnosBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(12, 0.90, 2, "m")); // IMC = 14.8
    }

}
