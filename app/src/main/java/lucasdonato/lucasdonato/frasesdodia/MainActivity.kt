package lucasdonato.lucasdonato.frasesdodia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    val frases = arrayOf(
        "O importante não é vencer todos os dias, mas lutar sempre.",
        "Maior que a tristeza de não haver vencido é a vergonha de não ter lutado!",
        "É melhor conquistar a si mesmo do que vencer mil batalhas.",
        "Quem ousou conquistar e saiu pra lutar, chega mais longe!",
        "Tente mover o mundo - o primeiro passo será mover a si mesmo.",
        "Quando vires um homem bom, tenta imitá-lo; quando vires um homem mau, examina-te a ti mesmo.",
        "Não ser descoberto numa mentira é o mesmo que dizer a verdade.",
        "Para ver muita coisa é preciso despregar os olhos de si mesmo.",
        "Mesmo desacreditado e ignorado por todos, não posso desistir, pois para mim, vencer é nunca desistir.",
        "A alegria que se tem em pensar e aprender faz-nos pensar e aprender ainda mais.",
        "O ignorante afirma, o sábio duvida, o sensato reflete.",
        "Não espere por uma crise para descobrir o que é importante em sua vida.",
        "Não tentes ser bem-sucedido, tenta antes ser um homem de valor.",
        "Aja antes de falar e, portanto, fale de acordo com os seus atos.",
        "A religião do futuro será cósmica e transcenderá um Deus pessoal, evitando os dogmas e a teologia.",
        "O mundo não está ameaçado pelas pessoas más, e sim por aquelas que permitem a maldade.",
        "Reconhecer o que se sabe e reconhecer o que não se sabe, é digno daquele que sabe",
        "Aproximo-me suavemente do momento em que os filósofos e os imbecis têm o mesmo destino.",
        "Não há nada na nossa inteligência que não tenha passado pelos sentidos.",
        "O instinto é a mais inteligente das espécies de inteligência até agora descobertas."
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //chama o id do texto
        texto = findViewById(R.id.textoFrase) as TextView
    }

   //Chama as frases do array frases
    //função que gera as frases randomicas
   fun gerarFrase( view: View){

        val totalItensArray = frases.size // não limita o array a um numero mas sim ao total de frases que tiver nele
        val numeroAleatorio = Random.nextInt(totalItensArray) //Gera um numero random para o array

        texto.setText( frases [numeroAleatorio] ) // variavel texto recebe o numero da frase que será exibido

    }
}
