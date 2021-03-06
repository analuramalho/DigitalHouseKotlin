package aula_06.exercicios_array.nivel_2

/*1. Uma empresa de pesquisas precisa tabular os resultados da seguinte enquete
feita a um grande quantidade de organizações:

Você foi contratado para desenvolver um programa que leia o resultado da enquete
e informe ao final o resultado da mesma. O programa deverá ler os valores até ser
informado o valor 0, que encerra a entrada dos dados. Não deverão ser aceitos
valores além dos válidos para o programa (0 a 6). Os valores referentes a cada uma
das opções devem ser armazenados num vetor. Após os dados terem sido
completamente informados, o programa deverá calcular a percentual de cada um
dos concorrentes e informar o vencedor da enquete. O formato da saída foi dado
pela empresa, e é o seguinte:
*/


fun main() {

    var votacao = arrayListOf<Int>(0, 0, 0, 0, 0, 0)
    var total: Int = 0
    var SO = arrayOf<String>("Windows Server", "Unix", "Linux", "Netware", "Mac OS", "Outro")

    println("Qual o melhor Sistema Operacional para uso em servidores?")
    for (i in SO.indices) {

        println((i + 1)!!.toString() + " - " + SO[i])
    }
    do {
        println("Digite seu voto: ")
        var voto: Int = readLine()!!.toInt()

        if (voto < 0 || voto > 6) {
            println("Opção Invalida")
            continue
        }
        if (voto == 0) {
            break
        }

        votacao[voto - 1]++
        total++
    } while (true)


    println("Sistema Operacional Votos %")
    println("------------------- ----- ---")
    var iVencedor:Int = 0
    var maiorVoto: Int= 0
    var maiorPercentual: Double = 0.0
    for (i in SO.indices) {
        var porcentagem = (votacao[i] *100.0) / total
        if(votacao[i]>maiorVoto){
            maiorVoto=votacao[i]
            iVencedor=i
            maiorPercentual=porcentagem
        }
        println(SO[i] + "        " + votacao[i] + "     " + "%.2f".format(porcentagem)+ "%")
    }
    println("-------------------   -----")
    println("Total               $total\n")
    print("O Sistema Operacional mais votado foi o ,"+ SO[iVencedor]+" com "+ maiorVoto+" votos, correspondendo a "+"%.2f".format(maiorPercentual)+"% dos votos.")

}
