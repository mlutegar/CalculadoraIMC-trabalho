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

    // Baixo peso muito grave: IMC < 16 | (51.516, 1.80, 30, "masculino") = 12.3
    @Test
    public void testeAdultoPesoMuitoGrave() {
        Assert.assertEquals("Baixo peso muito grave", calcIMC.calcularImc(51.516, 1.80, 30, "masculino"));
    }

    // Baixo peso grave 1: 16 <= IMC < 17 | (51.84, 1.80, 30, "masculino") = 16
    @Test
    public void testeAdultoPesoGraveLimiteInferior() {
        Assert.assertEquals("Baixo peso grave", calcIMC.calcularImc(51.84, 1.80, 30, "masculino"));
    }

    // Baixo peso grave 2: 16 <= IMC < 17 | (54,756, 1.80, 30, "masculino") = 16,9
    @Test
    public void testeAdultoPesoGraveLimiteSuperior() {
        Assert.assertEquals("Baixo peso grave", calcIMC.calcularImc(54.756, 1.80, 30, "masculino"));
    }

    // Baixo peso1: 17 <= IMC < 18.5 | (55.08, 1.80, 30, "masculino") = 17
    @Test
    public void testeAdultoBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(55.08, 1.80, 30, "masculino"));
    }

    // Baixo peso2: 17 <= IMC < 18.5 | (59.616, 1.80, 30, "masculino") = 18.5
    @Test
    public void testeAdultoBaixoPesoSuperior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(59.616, 1.80, 30, "masculino"));
    }

    // Peso normal1: 18.5 <= IMC < 25 | (59.94, 1.80, 30, "masculino") = 18.5
    @Test
    public void testeAdultoPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(59.94, 1.80, 30, "masculino"));
    }

    // Peso normal2: 18.5 <= IMC < 25 | (80.676, 1.80, 30, "masculino") = 24.9
    @Test
    public void testeAdultoPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(80.676, 1.80, 30, "masculino"));
    }

    // Sobrepeso1: 25 <= IMC < 30 | (81, 1.80, 30, "masculino") = 25
    @Test
    public void testeAdultoSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(81, 1.80, 30, "masculino"));
    }

    // Sobrepeso2: 25 <= IMC < 30 | (96.876, 1.80, 30, "masculino") = 29.9
    @Test
    public void testeAdultoSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(96.876, 1.80, 30, "masculino"));
    }

    // Obesidade grau I1: 30 <= IMC < 35 | (97.2, 1.80, 30, "masculino") = 30
    @Test
    public void testeAdultoObesidadeGrauILimiteInferior() {
        Assert.assertEquals("Obesidade grau I", calcIMC.calcularImc(97.2, 1.80, 30, "masculino"));
    }

    // Obesidade grau I2: 30 <= IMC < 35 | (113.076, 1.80, 30, "masculino") = 34.9
    @Test
    public void testeAdultoObesidadeGrauILimiteSuperior() {
        Assert.assertEquals("Obesidade grau I", calcIMC.calcularImc(113.076, 1.80, 30, "masculino"));
    }

    // Obesidade grau II1: 35 <= IMC < 40 | (113.4, 1.80, 30, "masculino") = 35
    @Test
    public void testeAdultoObesidadeGrauIILimiteInferior() {
        Assert.assertEquals("Obesidade grau II", calcIMC.calcularImc(113.4, 1.80, 30, "masculino"));
    }

    // Obesidade grau II2: 35 <= IMC < 40 | (129.276, 1.80, 30, "masculino") = 39.9
    @Test
    public void testeAdultoObesidadeGrauIILimiteSuperior() {
        Assert.assertEquals("Obesidade grau II", calcIMC.calcularImc(129.5, 1.80, 30, "masculino"));
    }

    // Obesidade grau III (obesidade mórbida): IMC >= 40 | (129.6, 1.80, 30, "masculino") = 40
    @Test
    public void testeAdultoObesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calcIMC.calcularImc(129.6, 1.80, 30, "masculino"));
    }

    // VELHOS TESTES (20 no total)

    // VELHO MASCULINO

    // Baixo peso: IMC < 21.9 | (70.632, 1.80, 70, "masculino") = 21.8
    @Test
    public void testeVelhoMasculinoBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(70.632, 1.80, 70, "masculino"));
    }

    // Peso normal1: 22 <= IMC <= 27 | (71.28, 1.80, 70, "masculino") = 22
    @Test
    public void testeVelhoMasculinoPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(71.28, 1.80, 70, "masculino"));
    }

    // Peso normal2: 22 <= IMC <= 27 | (87.48, 1.80, 70, "masculino") = 27
    @Test
    public void testeVelhoMasculinoPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(87.48, 1.80, 70, "masculino"));
    }

    // Sobrepeso1: 27 < IMC <= 30 | (87.804, 1.80, 70, "masculino") = 27.1
    @Test
    public void testeVelhoMasculinoSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(87.804, 1.80, 70, "masculino"));
    }

    // Sobrepeso2: 27 < IMC <= 30 | (97,2, 1.80, 70, "masculino") = 30
    @Test
    public void testeVelhoMasculinoSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(97.2, 1.80, 70, "masculino"));
    }

    // Obesidade grau I1: 30 < IMC <= 35 | (97.524, 1.80, 70, "masculino") = 30.1
    @Test
    public void testeVelhoMasculinoObesidadeGrauILimiteInferior() {
        Assert.assertEquals("Obesidade grau I", calcIMC.calcularImc(97.524, 1.80, 70, "masculino"));
    }

    // Obesidade grau I2: 30 < IMC <= 35 | (113.076, 1.80, 70, "masculino") = 34.9
    @Test
    public void testeVelhoMasculinoObesidadeGrauILimiteSuperior() {
        Assert.assertEquals("Obesidade grau I", calcIMC.calcularImc(113.076, 1.80, 70, "masculino"));
    }

    // Obesidade grau II1: 35 < IMC <= 39.9 | (113.724, 1.80, 70, "masculino") = 35.1
    @Test
    public void testeVelhoMasculinoObesidadeGrauIILimiteInferior() {
        Assert.assertEquals("Obesidade grau II", calcIMC.calcularImc(113.8, 1.80, 70, "masculino"));
    }

    // Obesidade grau II2: 35 < IMC <= 39.9 | (129.276, 1.80, 70, "masculino") = 39.9
    @Test
    public void testeVelhoMasculinoObesidadeGrauIILimiteSuperior() {
        Assert.assertEquals("Obesidade grau II", calcIMC.calcularImc(129.276, 1.80, 70, "masculino"));
    }

    // Obesidade grau III (obesidade mórbida): IMC >= 40 | (129.6, 1.80, 70, "masculino") = 40
    @Test
    public void testeVelhoMasculinoObesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calcIMC.calcularImc(129.6, 1.80, 70, "masculino"));
    }

    // VELHO FEMININO

    // Baixo peso: IMC < 21.9 | (55.808, 1.60, 70, "feminino") = 21.8
    @Test
    public void testeVelhoFemininoBaixoPeso() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(55.808, 1.60, 70, "feminino"));
    }

    // Peso normal1: 22 <= IMC <= 27 | (56.32, 1.60, 70, "feminino") = 22
    @Test
    public void testeVelhoFemininoPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(56.32, 1.60, 70, "feminino"));
    }

    // Peso normal2: 22 <= IMC <= 27 | (69.12, 1.60, 70, "feminino") = 27
    @Test
    public void testeVelhoFemininoPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(69.12, 1.60, 70, "feminino"));
    }

    // Sobrepeso1: 27 < IMC <= 32 | (69.376, 1.60, 70, "feminino") = 27.1
    @Test
    public void testeVelhoFemininoSobrepeso1() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(69.4, 1.60, 70, "feminino"));
    }

    // Sobrepeso2: 27 < IMC <= 32 | (81.92, 1.60, 70, "feminino") = 32
    @Test
    public void testeVelhoFemininoSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(81.92, 1.60, 70, "feminino"));
    }

    // Obesidade grau I1: 32 < IMC <= 37 | (82.176, 1.60, 70, "feminino") = 32.1
    @Test
    public void testeVelhoFemininoObesidadeGrauI1() {
        Assert.assertEquals("Obesidade grau I", calcIMC.calcularImc(82.176, 1.60, 70, "feminino"));
    }

    // Obesidade grau I2: 32 < IMC <= 37 | (94.72, 1.60, 70, "feminino") = 37
    @Test
    public void testeVelhoFemininoObesidadeGrauILimiteSuperior() {
        Assert.assertEquals("Obesidade grau I", calcIMC.calcularImc(94.72, 1.60, 70, "feminino"));
    }
    // Obesidade grau II1: 37 < IMC <= 41.9 | (94.976, 1.60, 70, "feminino") = 37.1
    @Test
    public void testeVelhoFemininoObesidadeGrauII1() {
        Assert.assertEquals("Obesidade grau II", calcIMC.calcularImc(94.976, 1.60, 70, "feminino"));
    }

    // Obesidade grau II2: 37 < IMC <= 41.9 | (107.264, 1.60, 70, "feminino") = 41.9
    @Test
    public void testeVelhoFemininoObesidadeGrauIILimiteSuperior() {
        Assert.assertEquals("Obesidade grau II", calcIMC.calcularImc(107.264, 1.60, 70, "feminino"));
    }

    // Obesidade grau III (obesidade mórbida): IMC >= 42 | (107.52, 1.60, 70, "feminino") = 42
    @Test
    public void testeVelhoFemininoObesidadeGrauIII() {
        Assert.assertEquals("Obesidade grau III (obesidade mórbida)", calcIMC.calcularImc(107.52, 1.60, 70, "feminino"));
    }

    // CRIANÇAS TESTES (60 no total {5 idades [2,4,6,8,10], 6 classificações e 2 sexos})

    // CRIANÇA MASCULINO

    // 2 ANOS

    // Baixo peso: IMC < 14.8 | (10.935, 0.90, 2, "masculino") = 13.5
    @Test
    public void testeCriancaMasculino2AnosBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(10.935, 0.90, 2, "masculino"));
    }

    // Peso normal inferior: 14.8 <= IMC < 18.5 | (11.988, 0.90, 2, "masculino") = 14.8
    @Test
    public void testeCriancaMasculino2AnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(11.988, 0.90, 2, "masculino"));
    }

    // Peso normal superior: 14.8 <= IMC < 18.5 | (14.9, 0.90, 2, "masculino") = 18.4
    @Test
    public void testeCriancaMasculino2AnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(14.904, 0.90, 2, "masculino"));
    }

    // Sobrepeso inferior: 18.5 <= IMC <= 19.2 | (14.985, 0.90, 2, "masculino") = 18.5
    @Test
    public void testeCriancaMasculino2AnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(14.985, 0.90, 2, "masculino"));
    }

    // Sobrepeso superior: 18.5 <= IMC <= 19.2 | (15.552, 0.90, 2, "masculino") = 19.2
    @Test
    public void testeCriancaMasculino2AnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(15.552, 0.90, 2, "masculino")); // IMC = 19.2
    }

    // Obesidade: IMC > 19.2 | (15.663, 0.90, 2, "masculino") = 19.3
    @Test
    public void testeCriancaMasculino2AnosObesidade() {
        Assert.assertEquals("Obesidade", calcIMC.calcularImc(15.633, 0.90, 2, "masculino")); // IMC = 19.75
    }

    // 4 ANOS

    // Baixo peso: IMC < 14 | (15.32475, 1.05, 4, "masculino") = 13.9
    @Test
    public void testeCriancaMasculino4AnosBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(15.32475, 1.05, 4, "masculino"));
    }

    // Peso normal inferior: 14 <= IMC < 17.4 | (15.435, 1.05, 4, "masculino") = 14
    @Test
    public void testeCriancaMasculino4AnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(15.435, 1.05, 4, "masculino"));
    }

    // Peso normal superior: 14 <= IMC < 17.4 | (19.07325, 1.05, 4, "masculino") = 17.3
    @Test
    public void testeCriancaMasculino4AnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(19.07325, 1.05, 4, "masculino"));
    }

    // Sobrepeso inferior: 17.4 <= IMC <= 18 | (19.18350, 1.05, 4, "masculino") = 17.4
    @Test
    public void testeCriancaMasculino4AnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(19.18350, 1.05, 4, "masculino"));
    }

    // Sobrepeso superior: 17.4 <= IMC <= 18 | (19.845, 1.05, 4, "masculino") = 18
    @Test
    public void testeCriancaMasculino4AnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(19.845, 1.05, 4, "masculino"));
    }

    // Obesidade: IMC > 18 | (19.95525, 1.05, 4, "masculino") = 18.1
    @Test
    public void testeCriancaMasculino4AnosObesidade() {
        Assert.assertEquals("Obesidade", calcIMC.calcularImc(19.95525, 1.05, 4, "masculino"));
    }

    // 6 ANOS

    // Baixo peso: IMC < 13.8 | (16.87977, 1.11, 6, "masculino") = 13.7
    @Test
    public void testeCriancaMasculino6AnosBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(16.87977, 1.11, 6, "masculino"));
    }

    // Peso normal inferior: 13.8 <= IMC < 17.5 | (17.00298, 1.11, 6, "masculino") = 13.8
    @Test
    public void testeCriancaMasculino6AnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(17.00298, 1.11, 6, "masculino"));
    }

    // Peso normal superior: 13.8 <= IMC < 17.5 | (21.43854, 1.11, 6, "masculino") = 17.4
    @Test
    public void testeCriancaMasculino6AnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(21.43854, 1.11, 6, "masculino"));
    }

    // Sobrepeso inferior: 17.5 <= IMC <= 18.4 | (21.56175, 1.11, 6, "masculino") = 17.5
    @Test
    public void testeCriancaMasculino6AnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(21.56175, 1.11, 6, "masculino"));
    }

    // Sobrepeso superior: 17.5 <= IMC <= 18.4 | (22.64, 1.11, 6, "masculino") = 18.4
    @Test
    public void testeCriancaMasculino6AnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(22.64, 1.11, 6, "masculino"));
    }

    // Obesidade: IMC > 18.4 | (23, 1.11, 6, "masculino") = 18.6
    @Test
    public void testeCriancaMasculino6AnosObesidade() {
        Assert.assertEquals("Obesidade", calcIMC.calcularImc(23, 1.11, 6, "masculino"));
    }

    // CRIANÇA MASCULINO

// 8 ANOS

    // Baixo peso: IMC < 13.8 | (20.39108, 1.22, 8, "masculino") = 13.7
    @Test
    public void testeCriancaMasculino8AnosBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(20.39108, 1.22, 8, "masculino"));
    }

    // Peso normal inferior: 13.8 <= IMC < 18.6 | (20.57, 1.22, 8, "masculino") = 13.8
    @Test
    public void testeCriancaMasculino8AnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(20.57, 1.22, 8, "masculino"));
    }

    // Peso normal superior: 13.8 <= IMC < 18.6 | (27.5354, 1.22, 8, "masculino") = 18.5
    @Test
    public void testeCriancaMasculino8AnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(27.5354, 1.22, 8, "masculino"));
    }

    // Sobrepeso inferior: 18.6 <= IMC <= 20.0 | (27.77, 1.22, 8, "masculino") = 18.6
    @Test
    public void testeCriancaMasculino8AnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(27.77, 1.22, 8, "masculino"));
    }

    // Sobrepeso superior: 18.6 <= IMC <= 20.0 | (29.76, 1.22, 8, "masculino") = 20.0
    @Test
    public void testeCriancaMasculino8AnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(29.76, 1.22, 8, "masculino"));
    }

    // Obesidade: IMC > 20.0 | (30, 1.22, 8, "masculino") = 20.1
    @Test
    public void testeCriancaMasculino8AnosObesidade() {
        Assert.assertEquals("Obesidade", calcIMC.calcularImc(30, 1.22, 8, "masculino"));
    }

// 10 ANOS

    // Baixo peso: IMC < 14.2 | (28, 1.41, 10, "masculino") = 14.1
    @Test
    public void testeCriancaMasculino10AnosBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(28, 1.41, 10, "masculino"));
    }

    // Peso normal inferior: 14.2 <= IMC < 20.3 | (28.23102, 1.41, 10, "masculino") = 14.2
    @Test
    public void testeCriancaMasculino10AnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(28.23102, 1.41, 10, "masculino"));
    }

    // Peso normal superior: 14.2 <= IMC < 20.3 | (40.2, 1.41, 10, "masculino") = 20.29
    @Test
    public void testeCriancaMasculino10AnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(40.2, 1.41, 10, "masculino"));
    }

    // Sobrepeso inferior: 20.3 <= IMC <= 22 | (40.3584300, 1.41, 10, "masculino") = 20.3
    @Test
    public void testeCriancaMasculino10AnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(40.3584300, 1.41, 10, "masculino"));
    }

    // Sobrepeso superior: 20.3 <= IMC <= 22 | (43.7, 1.41, 10, "masculino") = 22.0
    @Test
    public void testeCriancaMasculino10AnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(43.7, 1.41, 10, "masculino"));
    }

    // Obesidade: IMC > 22 | (43.93701, 1.41, 10, "masculino") = 22.1
    @Test
    public void testeCriancaMasculino10AnosObesidade() {
        Assert.assertEquals("Obesidade", calcIMC.calcularImc(43.93701, 1.41, 10, "masculino"));
    }

    // CRIANÇA FEMININO

// 2 ANOS

    // Baixo peso: IMC < 14.4 | (11.66, 0.90, 2, "feminino") = 14.39
    @Test
    public void testeCriancaFeminino2AnosBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(11.66, 0.90, 2, "feminino"));
    }

    // Peso normal inferior: 14.4 <= IMC < 18 | (11.664, 0.90, 2, "feminino") = 14.4
    @Test
    public void testeCriancaFeminino2AnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(11.664, 0.90, 2, "feminino"));
    }

    // Peso normal superior: 14.4 <= IMC < 18 | (14.5, 0.90, 2, "feminino") = 17.99
    @Test
    public void testeCriancaFeminino2AnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(14.5, 0.90, 2, "feminino"));
    }

    // Sobrepeso inferior: 18 <= IMC <= 19.1 | (14.58, 0.90, 2, "feminino") = 18
    @Test
    public void testeCriancaFeminino2AnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(14.58, 0.90, 2, "feminino"));
    }

    // Sobrepeso superior: 18 <= IMC <= 19.1 | (15.471, 0.90, 2, "feminino") = 19.1
    @Test
    public void testeCriancaFeminino2AnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(15.471, 0.90, 2, "feminino"));
    }

    // Obesidade: IMC > 19.1 | (15.552, 0.90, 2, "feminino") = 19.2
    @Test
    public void testeCriancaFeminino2AnosObesidade() {
        Assert.assertEquals("Obesidade", calcIMC.calcularImc(15.552, 0.90, 2, "feminino"));
    }

// 4 ANOS

    // Baixo peso: IMC < 13.8 | (11.097, 1.05, 4, "feminino") = 13.7
    @Test
    public void testeCriancaFeminino4AnosBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(11.097, 1.05, 4, "feminino"));
    }

    // Peso normal inferior: 13.8 <= IMC < 16.8 | (15.435, 1.05, 4, "feminino") = 13.8
    @Test
    public void testeCriancaFeminino4AnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(15.435, 1.05, 4, "feminino"));
    }

    // Peso normal superior: 13.8 <= IMC < 16.8 | (18.51, 1.05, 4, "feminino") = 16.79
    @Test
    public void testeCriancaFeminino4AnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(18.51, 1.05, 4, "feminino"));
    }

    // Sobrepeso inferior: 16.8 <= IMC <= 18 | (18.522, 1.05, 4, "feminino") = 16.8
    @Test
    public void testeCriancaFeminino4AnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(18.522, 1.05, 4, "feminino"));
    }

    // Sobrepeso superior: 16.8 <= IMC <= 18 | (19.845, 1.05, 4, "feminino") = 18
    @Test
    public void testeCriancaFeminino4AnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(19.845, 1.05, 4, "feminino"));
    }

    // Obesidade: IMC > 18 | (20, 1.05, 4, "feminino") = 18.1
    @Test
    public void testeCriancaFeminino4AnosObesidade() {
        Assert.assertEquals("Obesidade", calcIMC.calcularImc(20, 1.05, 4, "feminino"));
    }

    // CRIANÇA FEMININO

// 6 ANOS

    // Baixo peso: IMC < 13.5 | (17.8405250, 1.15, 6, "feminino") = 13.49
    @Test
    public void testeCriancaFeminino6AnosBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(17.8405250, 1.15, 6, "feminino"));
    }

    // Peso normal inferior: 13.5 <= IMC < 17.1 | (18.053, 1.15, 6, "feminino") = 13.5
    @Test
    public void testeCriancaFeminino6AnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(18.053, 1.15, 6, "feminino"));
    }

    // Peso normal superior: 13.5 <= IMC < 17.1 | (22.46, 1.15, 6, "feminino") = 17.09
    @Test
    public void testeCriancaFeminino6AnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(22.46, 1.15, 6, "feminino"));
    }

    // Sobrepeso inferior: 17.1 <= IMC <= 18.8 | (22.61475, 1.15, 6, "feminino") = 17.1
    @Test
    public void testeCriancaFeminino6AnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(22.61475, 1.15, 6, "feminino"));
    }

    // Sobrepeso superior: 17.1 <= IMC <= 18.8 | (24.85, 1.15, 6, "feminino") = 18.8
    @Test
    public void testeCriancaFeminino6AnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(24.85, 1.15, 6, "feminino"));
    }

    // Obesidade: IMC > 18.8 | (25, 1.15, 6, "feminino") = 18.9
    @Test
    public void testeCriancaFeminino6AnosObesidade() {
        Assert.assertEquals("Obesidade", calcIMC.calcularImc(25, 1.15, 6, "feminino"));
    }

// 8 ANOS

    // Baixo peso: IMC < 13.6 | (20.1, 1.22, 8, "feminino") = 13.59
    @Test
    public void testeCriancaFeminino8AnosBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(20.1, 1.22, 8, "feminino"));
    }

    // Peso normal inferior: 13.6 <= IMC < 18.2 | (20.24224, 1.22, 8, "feminino") = 13.6
    @Test
    public void testeCriancaFeminino8AnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(20.24224, 1.22, 8, "feminino"));
    }

    // Peso normal superior: 13.6 <= IMC < 18.2 | (27.03, 1.22, 8, "feminino") = 18.19
    @Test
    public void testeCriancaFeminino8AnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(27.03, 1.22, 8, "feminino"));
    }

    // Sobrepeso inferior: 18.2 <= IMC <= 20.6 | (27.1, 1.22, 8, "feminino") = 18.2
    @Test
    public void testeCriancaFeminino8AnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(27.1, 1.22, 8, "feminino"));
    }

    // Sobrepeso superior: 18.2 <= IMC <= 20.6 | (30.63, 1.22, 8, "feminino") = 20.6
    @Test
    public void testeCriancaFeminino8AnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(30.63, 1.22, 8, "feminino"));
    }

    // Obesidade: IMC > 20.6 | (30.80988, 1.22, 8, "feminino") = 20.7
    @Test
    public void testeCriancaFeminino8AnosObesidade() {
        Assert.assertEquals("Obesidade", calcIMC.calcularImc(30.80988, 1.22, 8, "feminino"));
    }

// 10 ANOS

    // Baixo peso: IMC < 14 | (27, 1.41, 10, "feminino") = 13.99
    @Test
    public void testeCriancaFeminino10AnosBaixoPesoLimiteInferior() {
        Assert.assertEquals("Baixo peso", calcIMC.calcularImc(27, 1.41, 10, "feminino"));
    }

    // Peso normal inferior: 14 <= IMC < 20 | (28.12, 1.41, 10, "feminino") = 14
    @Test
    public void testeCriancaFeminino10AnosPesoNormalLimiteInferior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(28.12, 1.41, 10, "feminino"));
    }

    // Peso normal superior: 14 <= IMC < 20 | (39.7, 1.41, 10, "feminino") = 19.99
    @Test
    public void testeCriancaFeminino10AnosPesoNormalLimiteSuperior() {
        Assert.assertEquals("Peso normal", calcIMC.calcularImc(39.7, 1.41, 10, "feminino"));
    }

    // Sobrepeso inferior: 20 <= IMC <= 23 | (40.02, 1.41, 10, "feminino") = 20
    @Test
    public void testeCriancaFeminino10AnosSobrepesoLimiteInferior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(40.02, 1.41, 10, "feminino"));
    }

    // Sobrepeso superior: 20 <= IMC <= 23 | (45.7263, 1.41, 10, "feminino") = 23
    @Test
    public void testeCriancaFeminino10AnosSobrepesoLimiteSuperior() {
        Assert.assertEquals("Sobrepeso", calcIMC.calcularImc(45.7263, 1.41, 10, "feminino"));
    }

    // Obesidade: IMC > 23 | (45.92511, 1.41, 10, "feminino") = 23.1
    @Test
    public void testeCriancaFeminino10AnosObesidade() {
        Assert.assertEquals("Obesidade", calcIMC.calcularImc(45.92511, 1.41, 10, "feminino"));
    }
}
