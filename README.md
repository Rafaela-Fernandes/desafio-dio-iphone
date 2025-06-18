# desafio-dio-iphone

Olá para dar um incrementada no projeto criei uma loja que tem alguns produtos, em especial temos o pacote de eletronicos que contem
SmartPhones , temos marcas separadas por pacote , como solicita o desafio temos a marca aplle e seu iphone

# Pacotes Aplle
aqui teremos a classe Iphone , com atributos fixos como: fabricante , sistema operecional , esses atributos estão fixos pois atualemnte o sistema oprecional é unico para todos os modelos
assim como fabricante . No caso do modelo é atributo privado que ser retornado ou acessados via metodos get e set .
Vale Ressaltar que as interface criadas para o Iphone são defaults podendo ser acessa somente pelas classes que estão dentro do pacote Aplle, deixando exclusivas para marca.

# Pacote Motorola e Samsung
Criei mais duas marcas de celulares , para mostrar outra forma de se construir um smartphone básico, com caracterisicas e metodos polimorficos.
Foram criados uma classe Abstrata SmartPhoneBase que pode ser estendida para suas subclasses , afinal os modelos da motorola e samsung são SmartPhones , e fazem ligacao etc...
foram criadas duas interface publicas NavegadorBase e ReprodutorMusicalBase , com funções que podem ser reutilizaveis para qalquer marca de celulares na construções de seus modelos.
