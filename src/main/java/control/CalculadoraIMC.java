package control;

import java.util.Objects;

public class CalculadoraIMC {
    // calcularIMC: método que calcula o IMC de uma pessoa
    public String calcularImc(double peso, double altura, int idade, String sexo) {
        // verificação de idade
        if (idade <= 20) {
            return calcularImcCrianca(idade, sexo, Imc(peso, altura));
        } else if (idade < 65) {
            return calcularImcAdulto(Imc(peso, altura));
        } else {
            return calcularImcVelho(sexo, Imc(peso, altura));
        }
    }

    private static double Imc(double peso, double altura) {
        return peso / (altura * altura);
    }

    // ADULTOS MÉTODOS (14 no total)
    public String calcularImcAdulto(double imc) {
        if (imc < 16) {
            return "Baixo peso muito grave";
        } else if (imc >= 16 && imc < 17) {
            return "Baixo peso grave";
        } else if (imc >= 17 && imc < 18.5) {
            return "Baixo peso";
        } else if (imc >= 18.5 && imc < 25) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc < 35) {
            return "Obesidade grau I";
        } else if (imc >= 35 && imc < 40) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III (obesidade mórbida)";
        }
    }

    // VELHOS MÉTODOS (20 no total)
    public String calcularImcVelho(String sexo, double imc) {
        if (Objects.equals(sexo, "m")) {
            // Classificação para homens acima de 65 anos
            if (imc < 22) {
                return "Baixo peso";
            } else if (imc >= 22 && imc <= 27) {
                return "Peso normal";
            } else if (imc > 27 && imc <= 30) {
                return "Sobrepeso";
            } else if (imc > 30 && imc <= 35) {
                return "Obesidade grau I";
            } else if (imc > 35 && imc <= 39.9) {
                return "Obesidade grau II";
            } else {
                return "Obesidade grau III (obesidade mórbida)";
            }
        } else if (Objects.equals(sexo, "f")) {
            // Classificação para mulheres acima de 65 anos
            if (imc < 21.9) {
                return "Baixo peso";
            } else if (imc >= 22 && imc <= 27) {
                return "Peso normal";
            } else if (imc > 27 && imc <= 32) {
                return "Sobrepeso";
            } else if (imc > 32 && imc <= 37) {
                return "Obesidade grau I";
            } else if (imc > 37 && imc <= 41.9) {
                return "Obesidade grau II";
            } else {
                return "Obesidade grau III (obesidade mórbida)";
            }
        } else {
            return "Sexo informado inválido.";
        }
    }

    // CRIANÇAS MÉTODOS (60 no total {5 idades [2,4,6,8,10], 6 classificações e 2 sexos})
    public String calcularImcCrianca(int idade, String sexo, double imc) {
        if (Objects.equals(sexo, "m")) {
            return calcularImcCriancaMasculino(idade, imc);
        } else if (Objects.equals(sexo, "f")) {
            return calcularImcCriancaFeminino(idade, imc);
        } else {
            return "Sexo informado inválido.";
        }
    }

    public String calcularImcCriancaFeminino(int idade, double imc) {
        if (idade == 2) {
            return calcularImcCriancaFeminino2Anos(imc);
        } else if (idade == 4) {
            return calcularImcCriancaFeminino4Anos(imc);
        } else if (idade == 6) {
            return calcularImcCriancaFeminino6Anos(imc);
        } else if (idade == 8) {
            return calcularImcCriancaFeminino8Anos(imc);
        } else if (idade == 10) {
            return calcularImcCriancaFeminino10Anos(imc);
        } else {
            return "Idade informada não disponível.";
        }
    }

    public String calcularImcCriancaMasculino(int idade, double imc) {
        if (idade == 2) {
            return calcularImcCriancaMasculino2Anos(imc);
        } else if (idade == 4) {
            return calcularImcCriancaMasculino4Anos(imc);
        } else if (idade == 6) {
            return calcularImcCriancaMasculino6Anos(imc);
        } else if (idade == 8) {
            return calcularImcCriancaMasculino8Anos(imc);
        } else if (idade == 10) {
            return calcularImcCriancaMasculino10Anos(imc);
        } else {
            return "Idade informada não disponível.";
        }
    }

    public String calcularImcCriancaMasculino2Anos(double imc) {
        if (imc < 14.8) {
            return "Baixo peso";
        } else if (imc >= 14.8 && imc < 18.5) {
            return "Peso normal";
        } else if (imc >= 18.5 && imc <= 19.2) {
            return "Sobrepeso";
        } else if (imc > 19.2) {
            return "Obesidade";
        } else {
            return "IMC informado inválido.";
        }
    }

    public String calcularImcCriancaMasculino4Anos(double imc) {
        if (imc < 14) {
            return "Baixo peso";
        } else if (imc >= 14 && imc < 17.4) {
            return "Peso normal";
        } else if (imc >= 17.4 && imc <= 18) {
            return "Sobrepeso";
        } else if (imc > 18) {
            return "Obesidade";
        } else {
            return "IMC informado inválido.";
        }
    }

    public String calcularImcCriancaMasculino6Anos(double imc) {
        if (imc < 13.8) {
            return "Baixo peso";
        } else if (imc >= 13.8 && imc < 17.5) {
            return "Peso normal";
        } else if (imc >= 17.5 && imc <= 18.4) {
            return "Sobrepeso";
        } else if (imc > 18.4) {
            return "Obesidade";
        } else {
            return "IMC informado inválido.";
        }
    }

    public String calcularImcCriancaMasculino8Anos(double imc) {
        if (imc < 13.8) {
            return "Baixo peso";
        } else if (imc >= 13.8 && imc < 18.6) {
            return "Peso normal";
        } else if (imc >= 18.6 && imc <= 20.0) {
            return "Sobrepeso";
        } else if (imc > 20.0) {
            return "Obesidade";
        } else {
            return "IMC informado inválido.";
        }
    }

    public String calcularImcCriancaMasculino10Anos(double imc) {
        if (imc < 14.2) {
            return "Baixo peso";
        } else if (imc >= 14.2 && imc < 20.3) {
            return "Peso normal";
        } else if (imc >= 20.3 && imc <= 22) {
            return "Sobrepeso";
        } else if (imc > 22) {
            return "Obesidade";
        } else {
            return "IMC informado inválido.";
        }
    }

    public String calcularImcCriancaFeminino2Anos(double imc) {
        if (imc < 14.4) {
            return "Baixo peso";
        } else if (imc >= 14.4 && imc < 18) {
            return "Peso normal";
        } else if (imc >= 18 && imc <= 19.1) {
            return "Sobrepeso";
        } else if (imc > 19.1) {
            return "Obesidade";
        } else {
            return "IMC informado inválido.";
        }
    }

    public String calcularImcCriancaFeminino4Anos(double imc) {
        if (imc < 13.8) {
            return "Baixo peso";
        } else if (imc >= 13.8 && imc < 16.8) {
            return "Peso normal";
        } else if (imc >= 16.8 && imc <= 18) {
            return "Sobrepeso";
        } else if (imc > 18) {
            return "Obesidade";
        } else {
            return "IMC informado inválido.";
        }
    }

    public String calcularImcCriancaFeminino6Anos(double imc) {
        if (imc < 13.5) {
            return "Baixo peso";
        } else if (imc >= 13.5 && imc < 17.1) {
            return "Peso normal";
        } else if (imc >= 17.1 && imc <= 18.8) {
            return "Sobrepeso";
        } else if (imc > 18.8) {
            return "Obesidade";
        } else {
            return "IMC informado inválido.";
        }
    }

    public String calcularImcCriancaFeminino8Anos(double imc) {
        if (imc < 13.6) {
            return "Baixo peso";
        } else if (imc >= 13.6 && imc < 18.2) {
            return "Peso normal";
        } else if (imc >= 18.2 && imc <= 20.6) {
            return "Sobrepeso";
        } else if (imc > 20.6) {
            return "Obesidade";
        } else {
            return "IMC informado inválido.";
        }
    }

    public String calcularImcCriancaFeminino10Anos(double imc) {
        if (imc < 14) {
            return "Baixo peso";
        } else if (imc >= 14 && imc < 20) {
            return "Peso normal";
        } else if (imc >= 20 && imc <= 23) {
            return "Sobrepeso";
        } else if (imc > 23) {
            return "Obesidade";
        } else {
            return "IMC informado inválido.";
        }
    }
}
