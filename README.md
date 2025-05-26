# Respostas 🤓

## Questão 1 ✍️

**a) Os construtores de superclasse não são herdados por subclasses.**
<br>**✅ Verdadeira.**<br>
Construtores não são herdados. A subclasse precisa declarar seus próprios construtores e, se necessário, chamar o construtor da superclasse usando super().

**b) Um relacionamento "tem um" é implementado via herança.**
<br>**❌ Falsa.**<br>
Esse tipo de relacionamento é representado por composição ou agregação. A herança representa um relacionamento "é um" (is-a).

**c) Quando uma subclasse redefinir um método de superclasse utilizando a mesma assinatura, diz-se que a subclasse sobrecarrega esse método de superclasse.**
<br>**❌ Falsa.**<br>
Isso é chamado de sobrescrita (override).
Sobrecarga (overload) ocorre quando métodos têm o mesmo nome, mas diferentes assinaturas (número ou tipo de parâmetros).


## Questão 2 ✍️

**Alguns programadores evitam protected porque ele exõe detalhes internos da superclasse para todas as subclasses e classes no mesmo pacote, o que pode quebrar o encapsulamento.**

- Vantagens do protected: facilita reutilização em subclasses, especialmente em frameworks ou herança planejada.

- Desvantagens: maior acoplamento entre super e subclasse, risco de violar invariantes da superclasse.

- Comparação com private: private garante encapsulamento completo. Para reutilizar, usa-se métodos protected ou public controlados.

## Questão 3 ✍️

**Em Java, sempre que uma subclasse é instanciada, o construtor da superclasse é chamado antes do corpo do construtor da subclasse ser executado.**

- Se não houver chamada explícita com ```super(...)```, o compilador tenta inserir ```super()``` automaticamente.

- Isso é obrigatório porque o estado herdado da superclasse precisa ser inicializado antes da lógica da subclasse.

# Codigos com o restante das questões na pasta "src"! 🤓