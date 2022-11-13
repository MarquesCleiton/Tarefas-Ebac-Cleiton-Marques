## Padrão Injeção de Dependências

O padrão de projeto Injeção de Dependências, dentre seus muitos benefícios, nos ajuda a deixar o nosso código desacoplado, facilitando a leitura e melhorando a distribuição de responsabilidade entre as classes. Ele tem como principal objetivo retirar a dependência/instanciação de objetos, que realiza alguma função específica dentro de uma classe, e deixando a responsabilidade para quem chama a classe.

Supondo que uma classe A dependa de uma classe B. Poderíamos instanciar B diretamente na declaração:
``` java
public class A{
	private B b = new B();
}
```
Mas fazendo isso, criamos um acoplamento que fica difícil de fazer um código modular. Se nossa aplicação conversasse com 3 bancos de dados, teríamos que criar 3 objetos diferentes, onde cada objeto teria suas próprias implementações e padrões distintos. A complexidade de manutenção com o tempo seria cada vez maior.

Poderíamos  deixa a injeção dessa dependência por meio de um construtor ou um método setter, acrescentado de programação orientado a interfaces, onde qualquer implementação da interface B poderia ser utilizada:

``` java
public class A {
	private IB b;
	public A(IB b){
		this.b = b;
	}
}
// OU
public class A {
	private IB b;
	public void setB(IB b){
		this.b = b;
	}
}

```
Não importando quem chame a classe A, passando como parâmetro um objeto de banco de dados X, Y ou Z que implementa B, o nosso programa, sem precisar fazer qualquer validação de qual banco ele utilizará, ele conseguirá executar sem problemas.

Infelizmente a Injeção de Dependência tem a desvantagem de deixar a responsabilidade de instanciar os objetos para as classes que implementam A, por exemplo:
```java
public class C{
	public void fazAlgo(){
		IB b = new BancoX();
		A a = new A(b);
	}
}
```

Para nos ajudar a deixar o código mais limpo, os frameworks, como o SpringBoot, nos auxilia a fazer essas Injeções de uma forma mais sucinta, utilizando anotações fornecidas por ele:

```java
public class C{
	@Inject
	private IB b;
	public void fazAlgo(){
		A a = new A(b);
	}
}
```
Utilizando as anotações para mascarar essas injeções de dependências, não precisamos instanciar com um 'new' cada uma das implementações que formos criando.