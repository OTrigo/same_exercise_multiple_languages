#include <stdio.h>

float calcularImposto(float salario)
{
  if (salario >= 0 && salario <= 1100)
  {
    return 0.05F * salario;
  }
  else if (salario >= 1100.01 && salario <= 2500.00)
  {
    return 0.10F * salario;
  }
  else
  {
    return 0.15F * salario;
  }
}

int main()
{
  float salario = 0.;
  printf("Digite o seu salário: ");
  scanf("%f", &salario);

  float beneficios = 0.;
  printf("Digite o valor do benefício: ");
  scanf("%f", &beneficios);

  float imposto = calcularImposto(salario);

  printf("Resultado: %f", (salario - imposto + beneficios));
  return 0;
}
