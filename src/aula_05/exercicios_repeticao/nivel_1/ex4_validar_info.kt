package aula_05.exercicios_repeticao.nivel_1

/*4. Faça um programa que leia e valide as seguintes informações:
Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Sexo: 'f' ou 'm';
Estado Civil: 's', 'c', 'v', 'd';*/

fun main() {
    var nome: String
    var idade: Int
    var salario: Double
    var sexo: String
    var estadoCivil: String

    do {
        print("Digite o seu nome: ")
        nome = readLine()!!

        if (nome.length > 3) break

        println("O nome deve ter mais que 3 caracteres!")
    } while (true)

    do {
        print("Digite a sua idade: ")
        idade = readLine()!!.toInt()

        if (idade in 0..150) break

        println("A idade deve estar entre 0 e 150!")
    } while (true)

    do {
        print("Digite o seu salário: ")
        salario = readLine()!!.toDouble()

        if (salario > 0) break

        println("O salário deve ser maior que zero!")
    } while (true)

    do {
        print("Digite o seu sexo biológico: ")
        sexo = readLine()!!.toUpperCase()

        if (sexo == "F" || sexo == "M") break

        println("Sexo biológico inválido!")
    } while (true)

    do {
        print("Digite seu estado civil (s, c, v ou d): ")
        estadoCivil = readLine()!!.toLowerCase()

        if (estadoCivil == "s" || estadoCivil == "c" || estadoCivil == "v" || estadoCivil == "d") break

        println("Estado cívil inválido!")
    } while (true)

    println("Nome: $nome")
    println("Idade: $idade")
    println("Salário: $salario")
    println("Sexo: $sexo")
    println("Estado Civil: $estadoCivil")
}