def calcular_imposto(salario):
  imposto = 0.00
  if(salario >= 0 and salario <=1100):
    imposto = 0.05
  elif(salario >= 1100.01 and salario <= 2500):
    imposto = 0.1
  else:
    imposto = 0.15
  return imposto*salario

valor_salario = float(input("Salario... "))
valor_beneficios = float(input("Beneficios... "))

valor_imposto = calcular_imposto(valor_salario)

resultado = valor_salario - valor_imposto + valor_beneficios

print(f'{resultado:.2f}')