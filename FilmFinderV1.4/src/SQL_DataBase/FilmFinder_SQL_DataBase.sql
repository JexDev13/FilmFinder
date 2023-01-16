drop database if exists proyecto1;
create database proyecto1;
use proyecto1;
create table  pelicula
(
	idPelicula int  auto_increment not null,
        nombrePelicula varchar(2000)  not null,
	Estreno varchar(4)  not null,
        idioma varchar(50) not null,
        PuntuacionSobre5 varchar(20) not null,
        sinopsis varchar (2000) not null  ,
        genero varchar(2000) not null,
        directo  varchar(100) not null,
	Disponibilidad varchar(20) not null,
        
        primary key (idPelicula)
  
);


create table  prestamoPelicula
(
	idPrestamo int  auto_increment not null,
        IdPelicula varchar(2000)  ,
	Titulo varchar(500)  ,
        idEstudiante varchar(50) ,
        NombreEstudiante varchar(50) ,
        ApellidoEstudiante varchar (50) ,
        FechaPrestamo varchar(30) ,
        FechaDevolucion  varchar(30) ,
        
        primary key (idPrestamo)
  
);

insert into pelicula(nombrePelicula,Estreno,idioma,PuntuacionSobre5,sinopsis,genero,directo,Disponibilidad) values( 
"Thor: Amor y Trueno ",
 "2020",
 "Español",
 "3",
 "Thor: Love and Thunder retoma la acción tras los sucesos ocurridos 
 en Vengadores: Endgame. El dios del trueno decide retirarse y dejar 
 la vida de superhéroe atrás. Después de abandonar la Nueva Asgard y 
 dejarla en manos de su querida amiga Valquiria, Thor se marcha junto a 
 los Guardianes de la Galaxia en un viaje que le lleva a plantearse su
 vida y su propia existencia.
Pero este momento no le podrá durar mucho, ya que rápidamente tendrá que
 volver a la acción para enfrentarse a Gorr, un villano que ha planeado 
 asesinar a todos los dioses. Pero esta no será la única casuística 
 a la que tendrá que hacer frente el dios del trueno, por si fuera poco,
 su ex Jane Foster, quien ahora es la portadora del Mjölnir, también entra en escena.", 
 " Acción",
 "Taika Waititi",
 "Diponible");
 insert into pelicula(nombrePelicula,Estreno,idioma,PuntuacionSobre5,sinopsis,genero,directo,Disponibilidad) values (
 "Sonic 2: La pelicula",
 "2022", "Español",
"5",
 "Tras irse a vivir a la ciudad de Green Hills, Sonic tiene muchas ganas de demostrar que puede ser un verdadero héroe. Su gran reto se presenta con la vuelta del malvado Robotnik, en esta ocasión con un nuevo compinche: Knuckles. Ambos andan a la busca de una esmeralda que tiene el poder de destruir civilizaciones.
El erizo azul forma equipo con su propio compañero de fatigas, Tails, y juntos se lanzan a una aventura que les llevará por todo el mundo en busca de la preciada gema, para evitar que caiga en manos de los villanos.",
"Aventura",
"Jeff Fowler",
 "Diponible");
 insert into pelicula(nombrePelicula,Estreno,idioma,PuntuacionSobre5,sinopsis,genero,directo,Disponibilidad) values(
 "Milla 22: El Escape",
 "2018",
 "Español",
"3",
 "James Silva (Mark Wahlberg) es un experimentado oficial de la CIA que es enviado a un país sospechoso de estar realizando actividades nucleares ilegales.

Cuando el agente se cruce en su camino con LI (Iko Uwais), el funcionario local recién llegado a la embajada de los Estados Unidos en busca de intercambiar información sobre material radioactivo robado a cambio de su paso seguro al país estadounidense, Silva tiene la tarea de transportarlo desde el centro de una ciudad, hasta una pista de aterrizaje situada a 22 millas de distancia, en lo que se convierte en una arriesgada y peligrosa misión. Mile 22.",
 "Crimen",
 "Peter Berg",
 "Diponible");
  insert into pelicula(nombrePelicula,Estreno,idioma,PuntuacionSobre5,sinopsis,genero,directo,Disponibilidad) values(
  "Maléfica 2: Dueña del Mal",
 "2019",
 "Español",
 "3",
 "MALÉFICA: DUEÑA DEL MAL, de Disney, es una aventura de fantasía que retoma la historia de MALÉFICA varios años más tarde —en la que se dieron a conocer los hechos que endurecieron el corazón de la villana más emblemática de Disney y la llevaron a arrojar una maldición sobre la princesa recién nacida: Aurora.

La película continúa explorando la compleja relación entre el hada de enormes cuernos y la futura reina, mientras forjan nuevas alianzas y se enfrentan a nuevos adversarios en su lucha por proteger el páramo y las criaturas mágicas que lo habitan.",
 "Fantasía",
 "Joachim Rønning",
 "Diponible");
  insert into pelicula(nombrePelicula,Estreno,idioma,PuntuacionSobre5,sinopsis,genero,directo,Disponibilidad) values(
  "Injustice: Dioses entre nosotros",
 "2021",
 "Español",
 "4"
 ,"La historia se desarrolla en un universo paralelo dentro del Multiverso de DC Comics. En una Tierra alternativa,  Superman se convierte en un tirano y establece un nuevo orden mundial tomando el control de la Tierra, después de que el Joker lo engaña para que mate a Lois Lane y destruya Metrópolis con una bomba nuclear, Batman y sus aliados deberán intentar detenerlo.",
 "Aventura",
 "Matt Peters",
 "Diponible");
  insert into pelicula(nombrePelicula,Estreno,idioma,PuntuacionSobre5,sinopsis,genero,directo,Disponibilidad) values(
  "El Depredador",
 "2018",
 "Español",
 "5",
 "Cuando el pequeño Rory (Jacob Tremblay) activa accidentalmente el regreso a la Tierra de los yautjas, desencadenará la vuelta de los cazadores más letales del universo, una especie extraterrestre caracterizada por convertir en su trofeo al resto de criaturas y por obtener su poder a través de la hibridación.

Ahora, estos alienígenas han mejorado su ADN y ahora son aún más peligrosos, fuertes, inteligentes y mortales. Por eso, solo un grupo de exsoldados y una profesora de ciencias podrán evitar el fin de la humanidad. Predator.",
 "Acción",
 "Shane Black",
 "Diponible");
  insert into pelicula(nombrePelicula,Estreno,idioma,PuntuacionSobre5,sinopsis,genero,directo,Disponibilidad) values(
  "Power Rangers",
 "2017",
 "Español" , 
 "4",
 "Power Rangers es una película del año 2017 que puedes ver online gratis HD en español latíno en Pelis24.li

Billy, Zack, Kimberly, Trini y Jason son un equipo de adolescentes con las típicas preocupaciones de su edad. Pero ésto cambia, luego de estar en contacto con un extraño objeto, ellos descubren que poseen superpoderes. De la noche a la mañana, se transforman en superhéroes, así que deciden aprovechar sus extraordinarias cualidades para salvar la Tierra. Y es que, Angel Grove y el resto del planeta están en peligro por culpa de una amenaza alienígena.

Los 5 muchachos se convertirán en los Power Rangers: Billy (RJ Cyler) sería el ranger azul, Zack (Ludi Lin) se convertirá en el Ranger Negro, Kimberly (Naomi Scott) se transformará en la Ranger Rosa, Trini (Becky G.) será la Ranger Amarillo y Jason (Dacre Montgomery) el Ranger Rojo. Ellos juntos y apoyados por Zordon (Bryan Cranston), el mentor de éstos jóvenes guerreros, tendrán que enfrentarse contra la terrible villana extraterrestre Rita Repulsa (Elizabeth Banks), para evitar que se apodere de la Tierra.",
 "Acción",
 "Dean Israelite",
 "Diponible");
  insert into pelicula(nombrePelicula,Estreno,idioma,PuntuacionSobre5,sinopsis,genero,directo,Disponibilidad) values( 
  "Kick-Ass 1",
 "2010",
 "Español", 
 "5" ,
 "Dave Lizewski no parece encajar con sus compañeros de instituto. Sus únicos amigos son los cómics así que un buen día toma una importante decisión: convertirse en superhéroe y salvador de la humanidad.

Gracias a un traje de buzo amarillo y verde consigue ser toda una revelación en la sociedad a pesar de no tener ningún poder especial ni tener ningún entrenamiento específico.

Pero no está solo… un padre y su hija, conocidos como Big Papi y Hit-Girl, luchan también por el mismo título que Dave.",
 "Comedia",
 "Matthew Vaughn",
 "Diponible");
  insert into pelicula(nombrePelicula,Estreno,idioma,PuntuacionSobre5,sinopsis,genero,directo,Disponibilidad) values(
  "Thor 3: Ragnarok",
 "2017",
 "Español", "4",
 "La tierra de Asgard est  en manos de la despiadada y todopoderosa Hela (Cate Blanchett), que robó el trono y ha encarcelado a Thor (Chris Hemsworth), enviándolo como prisionero al otro extremo de la galaxia. Sin su poderoso martillo Mjölnir, el Dios del Trueno se encuentra en una carrera contra el tiempo.

En el planeta Sakaar, Thor tendrá que pelear por su vida como un gladiador. Para escapar de su prisión, Thor tendrá que ser el ganador en una competencia alienígena, y vencer a su amigo, El increíble Hulk (Mark Ruffalo). Pero, por alguna extraño motivo, Hulk no recuerda a su compañero Vengador. Por supuesto que, por encima de todo, el objetivo del Dios del trueno será regresar a Asgard y detener el Ragnarok, el cual es un ciclo de vida y muerte sin fin, que podría significar la destrucción total e inminente de la civilización asgardiana.",
 "Acción",
 "Taika Waititi",
 "Diponible");
  insert into pelicula(nombrePelicula,Estreno,idioma,PuntuacionSobre5,sinopsis,genero,directo,Disponibilidad) values(
  "Fractura",
 "2019",
 "Español", "4",
 "Ray y su esposa Joanne viajan junto con su hija pequeña por el país. Tras un pequeño accidente de la pequeña en un área de descanso, la familia se dirige a toda prisa hacia el hospital más cercano.

Mientras la esposa y la hija se dirigen una sala para realizar a la pequeña de los Monroe una resonancia magnética, mientras, Ray, exhausto, se desmaya en una silla en el vestíbulo. Cuando este despierta no hay ninguna evidencia de que su mujer y su hija hayan estado en el hospital ni que llegase a estar ingresadas. Fractured",
 "Misterio",
 "Brad Anderson",
 "Diponible");
  insert into pelicula(nombrePelicula,Estreno,idioma,PuntuacionSobre5,sinopsis,genero,directo,Disponibilidad) values(
  "La maquina del tiempo",
 "2002",
 "Español", "5"
 ,"Los acontecimentos ocurren en la ciudad emblemática de Nueva York, estando encuadrados históricamente los hechos que suceden en el filme en el año 1899. El científico e inventor Alexander Hartdegen es uno de los más respetados y venerados dentro de su rama profesional, sobre todo al hacer especial hincapié en lo consagrada de su trayectoria tras resolver la mayor parte de los proyectos donde participa. Ahora bien, su nuevo objetivo es mostrar al mundo que viajar en el tiempo es posible, pretendiendo con ello que las personas puedan cambiar en cierta manera el desarollo de sus vidas.

La trama se sitúa en una ciudad emblemática como es el caso de Nueva York, estando encuadrados históricamente los hechos que se suceden en el filme en el año 1899. El científico e inventor Alexander Hartdegen es uno de los individuos más respetados y venerados dentro de su rama profesional, sobre todo al hacer especial hincapié en lo consagrada que se encuentra su trayectoria tras resolver con éxito la mayor parte de los proyectos en los que participa. Ahora bien, su nuevo objetivo es mostrar al mundo que viajar en el tiempo es posible, pretendiendo con ello que las personas puedan cambiar en cierta manera el desarollo de sus vidas.",
 "Ciencia Ficción",
 "Simon Wells",
 "Diponible");
  insert into pelicula(nombrePelicula,Estreno,idioma,PuntuacionSobre5,sinopsis,genero,directo,Disponibilidad) values(
  "La Leyenda de Tarzán",
 "2016",
 "Español", "4"
 ,"Son muchos los años que han pasado desde que el hombre conocido como Tarzán (Alexander Skarsgård) abandonara la selva de África. Ahora se hace llamar John Clayton III, Lord Greystoke, y se dedica a disfrutar del día a día de su aburguesada vida, que comparte con su amada esposa Jane (Margot Robbie).

Sin embargo, su tranquila y aristocrática rutina de hombre casado dará un giro inesperado cuando el Parlamento requiera sus servicios como emisario comercial, y sea invitado a que vuelva de nuevo al Congo que una vez habitó.

Lo que no sabe aún Lord Greystoke es que en realidad todo forma parte de un siniestro plan ideado por el capitán belga Leon Rom (Christoph Waltz), quien actúa movido por la avaricia y la venganza. Eso sí, los artífices de esta trampa asesina tampoco tienen ni idea de lo que están a punto de desatar",
 "Aventura",
 "David Yates",
 "Diponible");
  insert into pelicula(nombrePelicula,Estreno,idioma,PuntuacionSobre5,sinopsis,genero,directo,Disponibilidad) values(
  "Dragon Ball Z: La Resurrección de Freezer",
  "2015",
  "Español","3",
  "La paz ha invadido la Tierra. Sin embargo, aún quedan restos del ejército de Freezer. Sorbet y Tagamo, viejos miembros de élite de esta armada, acaban de arribar al planeta. Su objetivo primordial es revivir a su líder con las Esferas del Dragón y planificar su venganza contra los Saiyajin. Ahora, si Goku y Vegeta desean salvar al planeta tienen que alcanzar el nivel de verdaderos dioses.

DragonBall Z: La resurrección de F es la 19 película de la saga, que la dirige el debutante Tadayoshi Yamamuro y está escrita por Akira Toriyama, el creador de todo este universo Dragon Ball. DBS.",
 "Anime",
 "Tadayoshi Yamamuro",
 "Diponible");
 
   insert into pelicula(nombrePelicula,Estreno,idioma,PuntuacionSobre5,sinopsis,genero,directo,Disponibilidad) values(
   "Transformers 5: El Ultimo Caballero",
   "2017",
   "Español", "5"
 ,"¿Hasta que fecha se remonta la historia de los Transformers y su vinculación con la Tierra? ¿Siempre han estado aquí? ¿Cuál era su misión? ¿Y si un peligro mucho mayor nos atacara? El mundo ha cambiado por completo.

La Tierra es ahora un lugar desolado, plagado de edificios destruidos y donde los seres humanos luchan por sobrevivir al enfrentamiento que la humanidad mantiene con los robots alienígenas. Isabella (Isabela Moner) es una de las muchas personas cuya vida cambió drásticamente con la llegada de los extraterrestres.

La joven, que se ha adaptado completamente a su nueva vida en las calles, se unirá a Cade Yeager (Mark Wahlberg) para hacer frente al peligroso desafío que tienen por delante. Son dos especies en guerra, una de carne y hueso, la otra de metal. Ante dos mundos que colisionan, solo uno de ellos podrá sobrevivi",
 "Acción",
 "Michael Bay",
 "Diponible");
   insert into pelicula(nombrePelicula,Estreno,idioma,PuntuacionSobre5,sinopsis,genero,directo,Disponibilidad) values(
   "Valhalla Rising",
   "2009",
   "Español", "5",
   "En el año 1000 a. C un guerrero de fuerza sobrenatural llamado One Eye se encuentra secuestrado por el jefe de una tribu, Barde. One Eye recibe la consideración de un animal inútil y el único que mira por él es un chico esclavo que le lleva comida y agua de vez en cuando.
   El preso no aguanta más su situación y consigue escaparse con la ayuda de este joven, Are. En su huida, el guerrero no puede dejar a su fiel ayudante atrás así que se lo lleva con él y ambos emprenden un viaje largo y peligroso por la más absoluta oscuridad.
   
   Los forajidos consiguen embarcar en una nave vikinga, pero el barco no les llevará a ninguna parte pues se zambulle en una densa niebla que les hace perder la vista y la orientación. A pesar de las dificultades, la tripulación alcanza tierra firme por fin y se hallan en una tierra desconocida repleta de miedo y sangre donde One Eye descubrirá quién es verdaderamente.",
   "Aventura",
   "Nicolas Winding Refn",
 "Diponible");
   insert into pelicula(nombrePelicula,Estreno,idioma,PuntuacionSobre5,sinopsis,genero,directo,Disponibilidad) values(
 "Escuadron Suicida: Deuda Infernal",
 "2018",
 "Español", "2"
 ,"Amanda Waller forma el Escuadrón Suicida con Deadshot, Harley Quinn, Tigre de Bronce, Capitán Boomerang, Killer Frost y Copperhead, y los envía a recuperar un potencial objeto místico que está en la mira de otros villanos.",
 "Acción",
 "Sam Liu",
 "Diponible");
   insert into pelicula(nombrePelicula,Estreno,idioma,PuntuacionSobre5,sinopsis,genero,directo,Disponibilidad) values(
 "El Último Duelo",
 "2021",
 "Español","5",
 "Ambientada en Francia, en 1386, cuenta el enfrentamiento entre el caballero Jean de Carrouges (Matt Damon) y el escudero Jacques LeGris (Adam Driver), al acusar el primero al segundo de abusar de su esposa, Marguerite de Carrouges (Jodie Comer).

   El Rey Carlos VI decide que la mejor forma de solucionar el conflicto es un duelo a muerte. El que venza será el ganador, sin embargo, si lo hace el escudero, la esposa del caballero será quemada como castigo por falsas acusaciones.",
  "Acción",
  "Ridley Scott",
 "Diponible");
   insert into pelicula(nombrePelicula,Estreno,idioma,PuntuacionSobre5,sinopsis,genero,directo,Disponibilidad) values(
   "Atómica ",
   "2017",
   "Español","4",
   "Lorraine Broughton (Charlize Theron) es una espía de alto nivel del MI6 que se traslada a Berlín luego de la caída del muro, para terminar con una peligrosa red de espionaje que acaba de asesinar a un agente encubierto, el cual era su compañero y que, ahora, amenaza con revelar la identidad de los demás informantes de las agencias de inteligencia del mundo occidental.

Para evitar que esto pase, Lorraine debe formar equipo con el jefe de la sección de la capital alemana, David Percival (James McAvoy). Ellos tendrán que desatar todo su arsenal de habilidades para acabar con el  peligro que acecha a todos los agentes encubiertos en plena Guerra Fría.",
 "Misterio",
 "David Leitch",
 "Diponible");
   insert into pelicula(nombrePelicula,Estreno,idioma,PuntuacionSobre5,sinopsis,genero,directo,Disponibilidad) values( "Colossal",
 "2016",
 "Español","4",
 "Después de que su novio la abandone y de perder su trabajo, Gloria (Anne Hathaway) decide dejar Nueva York y volver al lugar donde pasó su infancia, una pequeña ciudad alejada del mundanal ruido de Manhattan. Gracias a su reencuentro con Oscar (Jason Sudeikis), antiguo amigo de adolescencia, la joven conseguirá retomar su vida.

Mientras, las noticias informan de que un gigantesco monstruo está destruyendo la ciudad de Seúl y causando numerosas bajas en la población. Será entonces cuando Gloria descubra, sorprendida, que su mente está conectada, de forma sobrenatural, con la de esta colosal criatura, por lo que deberá poner sus ideas en orden si no quiere seguir siendo una amenaza para la humanidad.",
 "Comedia",
 "Nacho Vigalondo",
 "Diponible");
   insert into pelicula(nombrePelicula,Estreno,idioma,PuntuacionSobre5,sinopsis,genero,directo,Disponibilidad) values("Wolverine: Inmortal",
 "2013",
 "Español", "5",
 "Wolverine (Hugh Jackman, ‘Gigantes de Acero‘) sigue de retiro de la civilización hasta que se topa en su camino con la posibilidad de dar el último adiós a un viejo amigo. Será entonces cuando se embarque en un viaje a lo desconocido rumbo a Japón, pero al llegar allí descubrirá que los motivos de su reencuentro son completamente diferentes, y se verá inmerso en medio de una disputa por el poder y la herencia de una gran familia. La hija del venerable anciano que conoció hace mucho tiempo se encuentra en peligro, y él hará todo lo posible para protegerla de los yakuza y su séquito de peligrosos samuráis que les perseguirán por todo el país.

Pero otro peligro les acecha, puesto que la inmortalidad de Logan está en juego y tendrá que luchar contra el dolor y la sangre por primera vez. Todo ello en su momento de mayor debilidad, poniendo a prueba su espíritu y su fortaleza física, descubriendo los límites y la maldición de su inmortalidad.",
 "Acción",
 "James Mangold",
 "Diponible");
 
CREATE TABLE portadas
(
	id_portada INT AUTO_INCREMENT,
	foto LONGBLOB,
	PRIMARY KEY(id_portada)
);
 
drop table portadas;
 select * from pelicula;
select * from portadas;
 Select count(*) from pelicula where idPelicula like '%6%';
 Select count(*) from pelicula where idPelicula like '6';