# Calculadora GUI Java - Projeto de Estudo

## 📝 Descrição
Este projeto demonstra a criação de uma calculadora simples com interface gráfica em Java, utilizando a biblioteca Swing. O programa recebe dois valores do usuário através de caixas de diálogo e exibe a soma dos números.

## 🚀 Funcionalidades
- Interface gráfica com caixas de diálogo
- Entrada de dois valores numéricos
- Conversão de texto para número
- Cálculo de soma
- Exibição do resultado em uma janela pop-up

## 💻 Tecnologias Utilizadas
- Java
- Biblioteca javax.swing

## 📚 Conceitos Abordados

### 1. Importação de Bibliotecas
```java
import javax.swing.*;
```
- A biblioteca Swing é utilizada para criar interfaces gráficas em Java
- O asterisco (*) importa todas as classes do pacote swing

### 2. Entrada de Dados
```java
String valor1 = JOptionPane.showInputDialog("Digite um valor: ");
```
- `JOptionPane.showInputDialog()`: Exibe uma caixa de diálogo para entrada de dados
- Retorna um valor do tipo String

### 3. Conversão de Tipos (Casting)
```java
double num1 = Double.parseDouble(valor1);
```
- `Double.parseDouble()`: Converte String para double
- Importante para operações matemáticas

### 4. Saída de Dados
```java
JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
```
- `JOptionPane.showMessageDialog()`: Exibe uma caixa de diálogo com uma mensagem
- O primeiro parâmetro `null` indica que não há componente pai
- Concatenação de strings para exibir o resultado

## 🎯 Objetivos de Aprendizado
1. Compreender a criação de interfaces gráficas básicas em Java
2. Praticar a manipulação de entrada/saída de dados
3. Entender a conversão de tipos de dados
4. Trabalhar com a biblioteca Swing


## 🔄 Possíveis Melhorias
1. Adicionar tratamento de exceções
2. Implementar validação de entrada
3. Adicionar mais operações matemáticas
4. Criar uma interface mais elaborada com botões
5. Implementar formatação de números
