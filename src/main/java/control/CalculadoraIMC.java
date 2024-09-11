package control;

import java.util.Objects;

public class CalculadoraIMC {
    // calcularIMC: método que calcula o IMC de uma pessoa
    public String calcularImc(double peso, double altura, int idade, String sexo) {
        // declaração de variáveis
        double IMC = peso / (altura * altura);

        // verificação de idade
        if (idade <= 20) {
            return calcularImcCrianca(idade, sexo, IMC);
        } else if (idade < 65) {
            return calcularImcAdulto(IMC);
        } else {
            return calcularImcVelho(sexo, IMC);
        }
    }

    // ADULTOS MÉTODOS (14 no total)
    public String calcularImcAdulto(double IMC) {
        if (IMC < 16) {
            return "Baixo peso muito grave";
        } else if (IMC >= 16 && IMC < 17) {
            return "Baixo peso grave";
        } else if (IMC >= 17 && IMC < 18.5) {
            return "Baixo peso";
        } else if (IMC >= 18.5 && IMC < 25) {
            return "Peso normal";
        } else if (IMC >= 25 && IMC < 30) {
            return "Sobrepeso";
        } else if (IMC >= 30 && IMC < 35) {
            return "Obesidade grau I";
        } else if (IMC >= 35 && IMC < 40) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III (obesidade mórbida)";
        }
    }

    // VELHOS MÉTODOS (20 no total)
    public String calcularImcVelho(String sexo, double IMC) {
        if (Objects.equals(sexo, "m")) {
            // Classificação para homens acima de 65 anos
            if (IMC < 21.9) {
                return "Baixo peso";
            } else if (IMC >= 22 && IMC <= 27) {
                return "Peso normal";
            } else if (IMC > 27 && IMC <= 30) {
                return "Sobrepeso";
            } else if (IMC > 30 && IMC <= 35) {
                return "Obesidade grau I";
            } else if (IMC > 35 && IMC <= 39.9) {
                return "Obesidade grau II";
            } else {
                return "Obesidade grau III (obesidade mórbida)";
            }
        } else if (Objects.equals(sexo, "f")) {
            // Classificação para mulheres acima de 65 anos
            if (IMC < 21.9) {
                return "Baixo peso";
            } else if (IMC >= 22 && IMC <= 27) {
                return "Peso normal";
            } else if (IMC > 27 && IMC <= 32) {
                return "Sobrepeso";
            } else if (IMC > 32 && IMC <= 37) {
                return "Obesidade grau I";
            } else if (IMC > 37 && IMC <= 41.9) {
                return "Obesidade grau II";
            } else {
                return "Obesidade grau III (obesidade mórbida)";
            }
        } else {
            return "Sexo informado inválido.";
        }
    }

    // CRIANÇAS MÉTODOS (60 no total {5 idades [2,4,6,8,10], 6 classificações e 2 sexos})
    public String calcularImcCrianca(int idade, String sexo, double IMC) {
        if (Objects.equals(sexo, "m")) {
            return calcularImcCriancaMasculino(idade, IMC);
        } else if (Objects.equals(sexo, "f")) {
            return calcularImcCriancaFeminino(idade, IMC);
        } else {
            return "Sexo informado inválido.";
        }
    }

    public String calcularImcCriancaFeminino(int idade, double IMC) {
        if (idade == 2) {
            return calcularImcCriancaFeminino2Anos(IMC);
        } else if (idade == 4) {
            return calcularImcCriancaFeminino4Anos(IMC);
        } else if (idade == 6) {
            return calcularImcCriancaFeminino6Anos(IMC);
        } else if (idade == 8) {
            return calcularImcCriancaFeminino8Anos(IMC);
        } else if (idade == 10) {
            return calcularImcCriancaFeminino10Anos(IMC);
        } else {
            return "Idade informada não disponível.";
        }
    }

    public String calcularImcCriancaMasculino(int idade, double IMC) {
        if (idade == 2) {
            return calcularImcCriancaMasculino2Anos(IMC);
        } else if (idade == 4) {
            return calcularImcCriancaMasculino4Anos(IMC);
        } else if (idade == 6) {
            return calcularImcCriancaMasculino6Anos(IMC);
        } else if (idade == 8) {
            return calcularImcCriancaMasculino8Anos(IMC);
        } else if (idade == 10) {
            return calcularImcCriancaMasculino10Anos(IMC);
        } else {
            return "Idade informada não disponível.";
        }
    }

    public String calcularImcCriancaMasculino2Anos(double IMC) {
        if (IMC < 14.8) {
            return "Baixo peso";
        } else if (IMC >= 14.8 && IMC < 18.2) {
            return "Peso normal";
        } else if (IMC >= 18.2 && IMC <= 19.2) {
            return "Sobrepeso";
        } else if (IMC > 19.2) {
            return "Obesidade";
        } else {
            return "IMC informado inválido.";
        }
    }

    public String calcularImcCriancaMasculino4Anos(double IMC) {
        if (IMC < 14.1) {
            return "Baixo peso";
        } else if (IMC >= 14.1 && IMC < 17.6) {
            return "Peso normal";
        } else if (IMC >= 17.6 && IMC <= 18.9) {
            return "Sobrepeso";
        } else if (IMC > 18.9) {
            return "Obesidade";
        } else {
            return "IMC informado inválido.";
        }
    }

    public String calcularImcCriancaMasculino6Anos(double IMC) {
        if (IMC < 13.7) {
            return "Baixo peso";
        } else if (IMC >= 13.7 && IMC < 17.7) {
            return "Peso normal";
        } else if (IMC >= 17.7 && IMC <= 19.6) {
            return "Sobrepeso";
        } else if (IMC > 19.6) {
            return "Obesidade";
        } else {
            return "IMC informado inválido.";
        }
    }

    public String calcularImcCriancaMasculino8Anos(double IMC) {
        if (IMC < 13.3) {
            return "Baixo peso";
        } else if (IMC >= 13.3 && IMC < 18.1) {
            return "Peso normal";
        } else if (IMC >= 18.1 && IMC <= 20.3) {
            return "Sobrepeso";
        } else if (IMC > 20.3) {
            return "Obesidade";
        } else {
            return "IMC informado inválido.";
        }
    }

    public String calcularImcCriancaMasculino10Anos(double IMC) {
        if (IMC < 13.1) {
            return "Baixo peso";
        } else if (IMC >= 13.1 && IMC < 18.5) {
            return "Peso normal";
        } else if (IMC >= 18.5 && IMC <= 21.3) {
            return "Sobrepeso";
        } else if (IMC > 21.3) {
            return "Obesidade";
        } else {
            return "IMC informado inválido.";
        }
    }

    public String calcularImcCriancaFeminino2Anos(double IMC) {
        if (IMC < 14.3) {
            return "Baixo peso";
        } else if (IMC >= 14.3 && IMC < 17.7) {
            return "Peso normal";
        } else if (IMC >= 17.7 && IMC <= 18.9) {
            return "Sobrepeso";
        } else if (IMC > 18.9) {
            return "Obesidade";
        } else {
            return "IMC informado inválido.";
        }
    }

    public String calcularImcCriancaFeminino4Anos(double IMC) {
        if (IMC < 13.9) {
            return "Baixo peso";
        } else if (IMC >= 13.9 && IMC < 17.3) {
            return "Peso normal";
        } else if (IMC >= 17.3 && IMC <= 18.6) {
            return "Sobrepeso";
        } else if (IMC > 18.6) {
            return "Obesidade";
        } else {
            return "IMC informado inválido.";
        }
    }

    public String calcularImcCriancaFeminino6Anos(double IMC) {
        if (IMC < 13.6) {
            return "Baixo peso";
        } else if (IMC >= 13.6 && IMC < 17.6) {
            return "Peso normal";
        } else if (IMC >= 17.6 && IMC <= 19.6) {
            return "Sobrepeso";
        } else if (IMC > 19.6) {
            return "Obesidade";
        } else {
            return "IMC informado inválido.";
        }
    }

    public String calcularImcCriancaFeminino8Anos(double IMC) {
        if (IMC < 13.2) {
            return "Baixo peso";
        } else if (IMC >= 13.2 && IMC < 18.1) {
            return "Peso normal";
        } else if (IMC >= 18.1 && IMC <= 20.3) {
            return "Sobrepeso";
        } else if (IMC > 20.3) {
            return "Obesidade";
        } else {
            return "IMC informado inválido.";
        }
    }

    public String calcularImcCriancaFeminino10Anos(double IMC) {
        if (IMC < 13) {
            return "Baixo peso";
        } else if (IMC >= 13 && IMC < 18.5) {
            return "Peso normal";
        } else if (IMC >= 18.5 && IMC <= 21.3) {
            return "Sobrepeso";
        } else if (IMC > 21.3) {
            return "Obesidade";
        } else {
            return "IMC informado inválido.";
        }
    }
}
