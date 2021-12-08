# JavaAppiumAluraAndroid
## Arquitetura Projeto

- Linguagem - [Java 8](https://www.java.com/pt_BR/  "Java 8")

- Orquestrador de testes - [Junit] 

- Framework interação com elementos web - [Selenium.WebDriver 3.141.59](https://www.seleniumhq.org/download/  "Selenium.WebDriver")

- Framework interação com elementos mobile - [Appium 1.13.0](http://appium.io/  "Appium")

**Aplicativo para ser testado**

- No diretório "resources/app" :  Utilizada para armazenar os arquivos do aplicativo (.apk)

**Pages**

Mapeamento dos elementos bem como as ações simples que podem ser através do Flows.

OBS: Com a utilizacao do [AppiumFieldDecorator](https://appium.github.io/java-client/io/appium/java_client/pagefactory/AppiumFieldDecorator.html"AppiumFieldDecorator") é possivel utilizar os recursos de "@AndroidFindBy" podendo assim, utilizar diferentes formas de localização de um elemento dependendo do sistema operacional utilizado pelo device.

Isso faz com que seja possivel utilizar uma mesma Page tanto para ios quanto para android na grande maioria dos casos.

Maiores informações: [Appium Page-objects](https://github.com/appium/java-client/blob/master/docs/Page-objects.md  "Appium Page-objects")

**Bases**

Camada subdivida em duas classes principais:

-  **TestBase** - Classe responsável por iniciar e finalizar o servidor Appium, os reports e os drivers para testes envolvendo dispositivos Android e iOS

-  **PageBase** - Classe responsável por ter métodos genéricos de ações em MobileElements, ListMobileElements e WebElements.

**Utils**

  

Camada ligada ao core da arquitetura subdivida em três em classes principais:

- DriverFactory - classe com instância do driver bem como a escolha do sistema operacional mobile e configurações que serão utilizadas. Utilize os parâmetros no arquivo **globalParameters.properties** confome a sua forma de execução:

Arquivo DriverFactory para execuções:

Permite executar testes Android:

- Device real Local utilizando o apk


Dicas de capabilities:

[Appium Desired Capabilities](http://appium.io/docs/en/writing-running-appium/caps/  "Appium Desired Capabilities")

[Appium Desired Capabilities by Cloud Grey](https://caps.cloudgrey.io/  "Appium Desired Capabilities by Cloud Grey")

- Utils - métodos genéricos que podem ser usados durante qualquer parte de um teste.
