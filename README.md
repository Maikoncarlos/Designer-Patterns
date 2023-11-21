# Designer-Patterns

Strategy
Que tipo de problema visa resolver?
R:soluciona possiveis problemas em que temos que fazer varios if/else, swith/case e assim uma classe irá crescer de forma a ficar complicado dar manutenção.
Como resolvemos esse problema?
R:sabemos qual os prováveis valores a serem enviadose, então criamos uma estratégia para cada valor e quando enviamos ele irá naquela estratégia / classe especifica executa e finaliza.



Chain of responsibility
Que tipo de problema visa resolver?
soluciona possiveis problemas em que temos que fazer varios if/else encadeados para aplicar varias regras possiveis para alguma regra ou varias regras no mesmo cenário.
Como resolvemos esse problema?
cadeia / corrente de responsabilidade onde eu tenho um fluxo que eu vou verificando qual será executado por não saber qual valor de entrada, assim criamos uma classe para cada regra e uma chamando a outra, até que seja executada e assim finaliza o processo.



Template Method
Que tipo de problema visa resolver?
R:soluciona problema de repetição de metodos códigos iguais em varias classes
Como resolvemos esse problema?
R:com a criação de um método concreto na classe “mãe”, que chama métodos abstratos implementados nas classes “filhas”



State
Que tipo de problema visa resolver?
R:soluciona problema com a situacao onde tem uma regra de transicao de status e assim teriamos que fazer varios if/else.
Como resolvemos esse problema?
R:criamos um novo atributo onde colocamos e criamos na classe os metodos responsáveis por alterar o status e também uma classe para cada status e seu calculo de desconto



Command
Que tipo de problema visa resolver?
R:problema de ter um código arquitetado recebendo os dados e executando todas as tarefas no mesmo local, duplicando bastante código.
Como resolvemos esse problema?
R:separamos cada classe conforme a acao que ela terá que executar assim cada uma terá sua responsabilidade.



Observer
Que tipo de problema visa resolver?
R:soluciona a forma de uma classe ter que implementar todas as acoes e assim a cada nova acao dentro dessa classe iria crescendo exponencialmente.
Como resolvemos esse problema?
R:criamos um atributo de tipo lista generica em que terá o metodo comum da ação e assim criamos cada classe separada por acao e nessa classe percorremos essa lista enviando cada acao a ser executada

