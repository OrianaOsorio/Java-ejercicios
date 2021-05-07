public class horoscopo
{

        public static void main (String[] args)
        {
		int dia =  0 ;
		int mes =  0 ;
		int year = 0 ;
		int op_mag = 0;
		int other = 0;
		int almacena = 0;
		boolean otro = true;
		boolean otro2 = true;
		int [] checar;
		checar = new int[100];
		while (otro==true) //menu para introducir la fecha de nacimiento
		{
			System.out.print("Introduzca el dia de su nacimiento =>");
			dia = Leer.datoint();
			System.out.print("Introduzca el mes de su nacimiento =>");
			mes = Leer.datoint();
			System.out.print("Introduzca el ano de su nacimiento =>");
			year = Leer.datoint();
			if ((dia>31)||(dia<1)||(mes>12)||(mes<1)||(year<0))
			{System.out.println("Introduzca una fecha valida");}
			else
			{
			op_mag = (dia+mes+year)%100; // funcion hashing por residuo
			checar[almacena]=op_mag; //almacena en el arreglo
			//evita que haya duplicidad de llaves y les asigna un nuevo valor si es el caso.
			for (int j=0;j<=almacena;j++)
			{

				if (almacena > 0)
				{

					for (int i=0;i<=almacena-1;i++)
					{
						if (checar[i]== op_mag)
						{
							op_mag++;
							checar[almacena]++;
							if (op_mag==100) op_mag=0;

						}
					}
					otro2 = false;
				}

			}
			almacena++;
			//aqui comienza la lista de horoscopos
			System.out.println("");
			if (op_mag==0)
			{
			System.out.println("Hechas de menos a una persona que se fue lejos");
			System.out.println("Tienes gran capacidad");
			System.out.println("Trata de comprender a los demas");
			System.out.println("No caigas en lo superfluo por querer estar en constante cambio");
			System.out.println("Numero de suerte 3");
			}
			if (op_mag==1)
			System.out.println("Debes poner mas cuidado en tu trabajo, sea taller, casa u oficina, no dejes que la desidia gane sobre tus deseos de triunfar. No dejes para manana lo que puedes hacer hoy.");
			if (op_mag==2)
			System.out.println("Tienes la preparacion y el caracter suficiente para hacer tu trabajo sin problemas, trata de que la inseguridad no te gane terreno, esto se puede reflejar en la ineficiencia, eres capaz de todo el exito");
			if (op_mag==3)
			System.out.println("Eres una persona que posee una brillante inteligencia y puedes llegar muy alto si te lo propones, no temas al fracaso, tu creatividad hoy brillara y ganaras un reconocimiento por tu ardua labor");
			if (op_mag==4)
			System.out.println("Amas la belleza y la elegancia, por eso las personas vulgares te molestan. Piensa que al final todos somos humanos y para convivir en paz es necesario aceptar a los demas como son. Numero de la suerte 9");
			if (op_mag==5)
			System.out.println("Tienes una vocacion univoca, tus preferencias estan enfocadas hacia los aspectos tecnicos y materiales, practicas o manuales. Es un buen dia para salir a correr y hacer ejercicio");
			if (op_mag==6)
			System.out.println("La simpatia es un don natural en ti, tu forma de ser te permite trabajar en mejor asociacion con alguien. Ten mas cuidado con escoger a las personas con las que haces confidencias. Numero de la suerte 7.");
			if (op_mag==7)
			System.out.println("Trata de ser mas estable emocionalmente y equilibra tus sentimientos, que por lo general son extremos, deberias de estar mas tranquilo ya que problemas que existen se resuelven muy pronto");
			if (op_mag==8)
			System.out.println("No te resulta tan facil encontrar personas afines a ti, eres tan exigente como un infante, es dificil que te puedas relacionar con una persona al nivel que quieres de indentificacion total. Numero de la suerte 8.");
			if (op_mag==9)
			System.out.println("Tu natural timidez hoy te vuelve a quitar una oportunidad de trabajo,deja de lamentarte tu mala suerte, recibiras un reconocimiento a tu experiencia y conocimientos");
			if (op_mag==10)
			System.out.println("Tienes buenas ideas de como mejorar el entorno social donde vives, pero no eres practico y no sabes como implementar tus ideas, busca el apoyo de personas que tengan posibilidades economicas.");
			if (op_mag==11)
			System.out.println("Eres facilmente influenciable cuando convives con personas de caracter muy fuerte, no te sientas inseguro, eres fuerte intelectual y moralmente. Tu numero de la suerte es el 8");
			if (op_mag==12)
			System.out.println("Con los cambios bruscos de temperatura parece que te sientes muy nervioso. A todos nos gusta que nos mimen pero tu, a veces, te pasas con exigir lo que en realidad no te niegan. Vas a poder demostrar la ternura que llevas dentro ayudando a un amigo que esta pasando por un mal momento. No cuentes tu vida privada a companeros o amigos que luego podrian ir cont andolo a todo el mundo. ");
			if (op_mag==13)
			System.out.println("No te obsesiones con ciertos suenos que vas a tener muy repetidos porque no tienen mucho que ver con la realidad. Si trabajas por tu cuenta dedica un poco m as de atencion e interes pues sin darte cuenta aparentas un poco de pasotismo. ");
			if (op_mag==14)
			System.out.println("Domina tus nervios y piensa bien las cosas antes de tomar decisiones, no te vayas a equivocar a la hora de hacer una inversion. La familia podria sacarte de quicio, porque los tienes acostumbrados a solucionarles todo. Cuidado con caidas tropezones o resbalones tontos que podrias lesionarte el tobillo. ");
			if (op_mag==15)
			System.out.println("Si te ofrecieran la colaboracion en un trabajo con familia podria salir bien, siempre y cuando se establezca el tema economico de una manera muy clara. No te ilusiones con alguien que vas a conocer en un lugar publico y que de repente te podrias creer que es el amor de tu vida. Tu corazon esta muy sensible y no te puedes enamorar de repente aunque estas muy necesitado de mimos y caricias. ");
			if (op_mag==16)
			System.out.println("Puedes tener sorpresas en negocios o trabajos y no te fies de palabras que te elogien porque en el fondo te van a traicionar. Puedes contar con la lealtad de tu pareja que en momentos dificiles va a estar a tu lado. No discutas con los hijos y trata de mantener su confianza. ");
			if (op_mag==17)
			System.out.println("Mercurio en conjuncion con tu signo te puede dar una pequena sorpresa de suerte. Har as un corto viaje en el que visitar as a familiares o amigos. No tengas mania a tu casa y no te obsesiones con las mudanzas. El color amarillo dorado te dar a suerte y seria bueno que pongas en tu casa flores blancas en numero impar. Te doler an un poco la cabeza y los oidos. ");
			if (op_mag==18)
			System.out.println("No te fies de falsos aduladores que intentan sacar de ti todo lo que pueden. Un buen proyecto de trabajo se podria retrasar, pero no quiere decir que no salga. Procura aguantar sin discutir con tu pareja aunque a veces te saque de quicio. Los nativos de este signo que grit ais y alguna vez amanaz ais luego en el fondo sois incapaces de de alejaros de vuestra familia. ");
			if (op_mag==19)
			System.out.println("Cuidate cualquier pequeno problema que te surja de la piel a fin de cortarlo en el principio. La lectura y la musica te har a estar un poco m as relajado en la noche y eso te llevar a a poder dormir un poco m as tranquilo y no darle vueltas al coco, pensando un monton de tonterias. Utiliza algo de color azul marino que te traer a mejor suerte.");
			if (op_mag==20)
			System.out.println("En tu hogar se respira buena armonia y todo hace pensar que hay un buen rollo y sobre todo un respeto hacia las personas mayores. El carino de los hijos podria ser un carino muy fuerte m as incluso que el carino de la pareja. Tienes ultimamente la mania de pensar que algo malo se acerca y no es cierto. ");
			if (op_mag==21)
			System.out.println("Se te va a declarar una persona comprometida,  andate con cuidado que no te lie tu futuro. Te van a invitar a una ceremonia a la que no vas a tener m as remedio que asistir. Si tienres entre manos la organizacion de un trabajo o la renovacion de algo, os va a ir de maravilla. Tomate algo para los ardores de estomago o malas digestiones. Alguna hierba o preparado natural");
			if (op_mag==22)
			System.out.println("Te sentir as muy querido, pero tu car acter siempre paga el mal humor con quien m as confianza tienes en tu familia. Necesitas salir de tu rutina habitual y dialogar a pesar de que parece que lo tienes todo hablado. Una cena en la intimidad podria ser el lugar idoneo para comentar los pequenos problemas de la familia. No hagas caso de ciertos companeros de tu trabajo porque sabes de antemano que te tienen envidia. ");
			if (op_mag==23)
			System.out.println("No seas tacano y no te olvides de tener algun detalle con la gente que sabes que te tiene aprecio. Utiliza ropa de color claro que te dar a m as suerte. No firmes nada a nadie, ni avales a familiares politicos porque te podrias ver obligado a pagar lo que no es tuyo. El numero 3 te puede dar una favorable noticia. ");
			if (op_mag==24)
			System.out.println("Intenta sonreir a las personas que te quierebn y divertirte un poco, la vida no solo se resume en trabajar. Para muchos de vosotros escribir o dibujar puede ser una aficion perfecta. Cuida tu vista y controla cualquier comienzo de conjuntivitis para que no vaya a m as. La familia ir a en aumento y es posible que pronto te comuniquen un nuevo nacimiento. ");
			if (op_mag==25)
			System.out.println("Para hablar de un nuevo trabajo o cambio no te guies por lo que te ofrezcan de repente y delante de la gente. vas a tener un gasto imprevisto de una pequena obra en casa. No te obsesiones con alguna pesadilla que se te repita y procura hacer un poco de gimnasia para mejorar tus cervicales. ");
			if (op_mag==26)
			System.out.println("Te encontrar as con alguien que hace mucho tiempo que no has visto y te llevar as una alegria muy positiva; pero no confundas la idea de carino y amistad con un romance o amor, porque eso no va a surgir tan r apido como quisieras. Cuidado con los problemas digestivos, que luego te puedes asustar cuando te encuentres mal. ");
			if (op_mag==27)
			System.out.println("En la familia habr a que ayudar a una mujer que parece que tiene mucho car acter pero que en estos d ais se sentir a un poco deprimida. No te obsesiones con la idea de comprar o cambiar de casa pues ser a mejor que trates de ahorrar un poco de dinero ya que luego lo vas a necesitar para algun imprevisto. En el azar no encuentras la solucion para los pequenos problemas que te quitan el sueno. ");
			if (op_mag==28)
			System.out.println("Te agobias por cualquier cosa y parece que te faltan fuerzas para solucionar los pequeno problemas de la familia, pero tienes tu la culpa de que se recurra a ti para conseguirlo. Un pequeno viaje te va a venir de maravilla aunque no vas a poder descansar todo lo que necesitas, porque vas a tener entre manos una idea nueva que tienes que llevar adelante nada m as pasar el verano. ");
			if (op_mag==29)
			System.out.println("El amor para ti pasa por unos dias un poco ap aticos y no tienes ganas de bromas. Intenta ser un poco m as carinoso y muestra un poco m as tu lado sensible, amable y carinoso");
			if (op_mag==30)
			System.out.println("Alguien que tuvo mucha importancia en tu vida amorosa podria traerte recuerdos y complicaciones. La familia te dar a todo el respaldo y apoyo que precises en estos momentos. La mala contestacion de un amigo te har a ver la falsedad de sus sentimientos. No hagas sociedades con nadie que tenga derecho a controlar tu dinero, y por lo menos que nadie te pueda dominar. ");
			if (op_mag==31)
			System.out.println("Vas a pensar en realizar un corto viaje que ser a muy positivo. No dejes de poner en tu casa, en la cocina, un ramo de perejil en agua y le echas un poco de azucar par que mejoren tus ingresos pronto. Trata de ser feliz con tu pareja y procura comprenderla porque en el fondo trata de ayudarte");
			if (op_mag==32)
			System.out.println("Personas de tu familia te agobian y te vas a comportar de diferente manera a como eres para que no se meta nadie en tu vida. Parece que te sigue la gente rara y complicada y podrias tener que quitarte de encima una persona muy pesada que no te interesa para nada y que tan solo te podrian complicar la vida. ");
			if (op_mag==33)
			System.out.println("En el fondo te sientes a veces o comprar pero que dependas de intermediarios. No dudes de salir de noche y divertirte un poco pues en la vida, todo no es trabajar y piensa que lo que tu guardas otros lo gastar an. Llama a un familiar que esta pasando un momento muy dificil. ");
			if (op_mag==34)
			System.out.println("Dias rom anticos en los que la nostalgia y el recuerdo te pueden llevar a setirte un poco decaido o depresivo. No te arrepientas de nada de lo que haces y dedicate a ser un poco m as feliz. Con tu pareja puedes vivir una cierta apatia y muy poca comunicacion. Parece que te hacen a ti responsable de todo lo que pasa y ya estas harto de tener la culpa de todo.");
			if (op_mag==35)
			System.out.println("Cuida un poco tu aspecto personal y procura ser un poco m as coqueto. En tu hogar seria positivo que pongas alguna flor blanca natural y algun vaso con agua y azucar para limpiar las energias negativas. No te creas los cuentos que te viene a decir un familar que solo intenta agobiarte. ");
			if (op_mag==36)
			System.out.println("Alguien que te ha interesado en el pasado va a intentar volver, pero debes de ser precavido y cauteloso para no caer en los mismos errores. Piensa que nada de lo que ha pasado ha sido mejor y que lo bueno para ti puede empezar ahora.");
			if (op_mag==37)
			System.out.println("Estas pasando unos dias estupendos y disfutando la vida a tope.Tienes ganas de juerga m as que nunca, y tan solo debes controlar tu actividad sexual espor adica. No olvides tomar medidas en ello. ");
			if (op_mag==38)
			System.out.println("No es buen momento para venir con exigencias. Trata de aguantarte con lo que tienes y pasar el momento. Para aumentos, renovaciones o reclamaciones procura tener un poco de paciencia. Debes aprender a saber esperar. ");
			if (op_mag==39)
			System.out.println("Tienes un morbo especial para la gente complicada y te puedes encontrar con una relacion sin futuro. Analiza si te interesa cambiar o seguir mejor con lo que tienes. ");
			if (op_mag==40)
			System.out.println("Intenta hacer un poco m as de ejercicio y tendr as la sensacion de renovarte. Podrias sentir molestias en tus ojos y les vendria bien que los cuidaras m as. ");
			if (op_mag==41)
			System.out.println("Momentos buenos para valorar un poco m as tu trabajo y poder recibir un incentivo. De todos modos, para pedir aumentos deber as hacerlo con tacto y esperando el momento oportuno para no tener lios con tus companeros.");
			if (op_mag==42)
			System.out.println("Reencuentros, conversaciones y acuerdos te dejar an atr as las discusiones, los celos y las amenazas. Todo vuelve por buen camino y la estabilidad va a regir tu corazon. Intenta ser m as feliz. ");
			if (op_mag==43)
			System.out.println("Cierto dolor de espalda te puede llevar a visitar un masajista o a tener que darte algunas friegas. Cuidado con las corrientes de aire o cambios bruscos de temperatura.");
			if (op_mag==44)
			System.out.println("Podrias coger un poco de dinero por una ayuda o favoritismo. No dejes pasar la oportunidad de que te quiera ayudar un familiar politico. En la suerte el numero 3 te dar a una alegria");
			if (op_mag==45)
			System.out.println("Tu vida puede atravesar por un momento de cierta confusion, y debes pensarte las cosas antes de decir la solucion . Una persona amiga muy querida te dar a apoyo, y hasta la solucion de tu tema amoroso");
			if (op_mag==46)
			System.out.println("Estas muy agotado porque no comes en el orden que deberias.Debes de sacar el tiempo para cuidarte un poco y prestale atencion a los desayunos que debes de hacer m as abundantes y con m as contenido vitaminico y de calorias");
			if (op_mag==47)
			System.out.println("Urano potencia negocios, proyectos y sociedades en las que andas metido. No des ideas a nadie para invertir y trata de poner tus ahorros en lugar seguro. El numero 1 te dar a suerte");
			if (op_mag==48)
			System.out.println("No tienes muchas ganas de lios y te sientes tranquilo sin buscar nada nuevo. La familia es posible que aumente y tengas que ir a una ceremonia");
			if (op_mag==49)
			System.out.println("Te puede doler un poco el cuello debido a una mala postura o a una corriente de aire frio. No dejes de abrigarte si sales de noche y evita las nieblas y las heladas. Un pequeno masaje te vendr a muy bien");
			if (op_mag==50)
			System.out.println("Buenos momentos para iniciar algun pequeno negocio o para escuchar proposiciones de mover un poco tus ahorros. Si tienes que pedir aumentos no es el miedo el que te tiene que condicionar. H ablalo y acl aralo");
			if (op_mag==51)
			System.out.println("No coquetees, ni provoques celos en una relacion que tengas estable pues podrias tener una bronca muy gorda sin ningun motivo ");
			if (op_mag==52)
			System.out.println("Tan pronto parece que te comes el mundo como te sientes deprimido y sin  animo. Das mucha importancia a un enfado que te puede llevar a perturbar el sueno, y tu descanso");
			if (op_mag==53)
			System.out.println("Renovaciones de contratos o resultados muy positivos en entrevistas de trabajo. No te cortes y acude donde sea, y si tuvieras que hablar con un personaje, te saldr a positivo. En los juegos de azar no esta ninguna solucion");
			if (op_mag==54)
			System.out.println("Buen momento para dedicarle tiempo y atencion a tu pareja y demostrarle todo lo que le quieres. No discutas por tonterias y trata de valorar todo lo positivo que tiene. Que tu familia no se meta por el medio en nada");
			if (op_mag==55)
			System.out.println("Pequenos mareos, o sensacion de inestabilidad provocadas por cierta alteracion de la tension arterial. No te tomes medicamentos por tu cuenta, ni hagas caso de terapias milagrosas que te cuenten");
			if (op_mag==56)
			System.out.println("Frena los gastos y caprichos de tu pareja porque luego te tocar a a ti solucionarlo. Puedes recibir la alegria de que tus ingresos habituales van a mejorar. Eso ser a bueno para todos");
			if (op_mag==57)
			System.out.println("Vuelcate en atenciones con la persona amada porque dentro de ti, hay mucho amor que dar. Si tienes una relacion a medias, las cosas se van a estabilizar ");
			if (op_mag==58)
			System.out.println("No dejes de revisarte un poco la vista porque sabes que forzarla es muy malo. El frio y el viento te pueden provocar algo de irritacion o de conjuntivitis. Te preocupar a un familiar que lleva tiempo muy delicado");
			if (op_mag==59)
			System.out.println("El comenzar en un trabajo o tomar la decision de organizar algo te puede salir bien. No aguantes a gente que se te quiera imponer porque puedes pasar de ellos totalmente");
			if (op_mag==60)
			System.out.println("En el fondo de tu ser estas un poco cansado de las rutinas, y te apeteceria vivir algo nuevo y diferente. Pero cuidate y no confies en amigos que te crees estan de tu lado y te podrian traicionar");
			if (op_mag==61)
			System.out.println("Los nervios se te alojar an en el estomago y te puedes sentir con estado de angustia o incluso tener algun colico. La familia te aconseja bien, pero no haces ni caso. Ciertos zumbidos te vienen a los oidos");
			if (op_mag==62)
			System.out.println("Por arreglar el vehiculo o un aparato vas a tener algunos gastos con los que no contabas.Tambien por un despiste puedes olvidar dinero o valores");
			if (op_mag==63)
			System.out.println("Controla los celos y no te metas a formar esc andalos o discusiones si no estas seguro de todo. Te vas a sentir muy querido y m as valorado de lo que tu has pensado");
			if (op_mag==64)
			System.out.println("Revisa un poco la graduacion de tu vista y no utilices ningun colirio que no sabes si es el adecuado. Atr as quedan pequenos problemas de digestivo que ya habr as ido superando");
			if (op_mag==65)
			System.out.println("Siempre te quejas, pero nunca te falta dinero y encima la gente piensa que tienes m as de lo que tienes. Podrias pensar en meterte en una inversion inmobiliaria que seria bastante positiva");
			if (op_mag==66)
			System.out.println("No te metas en discusiones con la familia politica porque al final ser a con los tuyos con los que podrias salir a mal. La gente podria cambiar el sentido de tus palabras y quedar tu en evidencia");
			if (op_mag==67)
			System.out.println("La boca te puede dar algun problema y podrias tener que necesitar un dentista urgentemente. Cuidad un poco con el aseo de tus encias");
			if (op_mag==68)
			System.out.println("Buen momento para pensar en hacer una pequena inversion con algun dinerito que teneis ahorrado. No esperes la llegada de la loteria, sino juegas");
			if (op_mag==69)
			System.out.println("Valora lo que tienes y frena tu car acter, pues sin darte cuenta siempre pagas el mal humor con la misma persona");
			if (op_mag==70)
			System.out.println("Repasa tu boca y no dejes para m as adelante cualquier pequeno problema dental que tengas. La salud de una persona mayor de tu casa te preocupar a mucho");
			if (op_mag==71)
			System.out.println("Te van a querer enganar al ofrecerte un buen negocio o inversion, pero luego las cosas no ser an tan f aciles como dicen. No pienses en asociarte para montar ningun negocio");
			if (op_mag==72)
			System.out.println("El prospecto de un compromiso no parece espantarte. Un vinculo ordinario comienza a convertirse en una relacion seria. En vez de huir, podrias invertir un poco m as en ti mismo cada dia");
			if (op_mag==73)
			System.out.println("Tendr as problemas con uno o m as de tus colegas. Se ha mostrado impaciencia -- OK, pero no hay necesidad de enfadares. Olvida el asunto, y todo saldr a bien");
			if (op_mag==74)
			System.out.println("Encontrar un pequeno problema en tu relacion no es un asunto serio. Solteros conocer an a alguien, pero la relacion no tendr a futuro");
			if (op_mag==75)
			System.out.println("Puedes felicitarte por un logro. Ojal a te confien un proyecto m as interesante. Si aprovechas tu dinamismo actual, llegar as lejos");
			if (op_mag==76)
			System.out.println("Si tienes pareja, tu parea y tu se llevan bien a la perfeccion. Si eres soltero, tendr as un encuentro con un nuevo amor o tendr as un amorio. Pase lo que pase, te divertir as");
			if (op_mag==77)
			System.out.println("Un cambio de estatus te beneficiar a, pero el cambio que traer a, ¿ser a positivo? Obviamente, aquellos que te rodean y tu tendr an que esperar y ver");
			if (op_mag==78)
			System.out.println("Tomada una decision, ya no pensar as m as al respecto. Tras la reflexion viene la accion. Logras cancelar planes para casarte o vivir con alguien");
			if (op_mag==79)
			System.out.println("Es un buen dia para planear proyectos. S acale el mayor provecho al momento. ¿Tu meta? No vayas demasiado lejos");
			if (op_mag==80)
			System.out.println("En cuanto a tu romance, las cosas podrian ser m as delicadas si no te esfuerzas. Tienes una tendencia a aburrirte en relaciones al largo plazo. Si eres soltero, puedes hacer lo que desees");
			if (op_mag==81)
			System.out.println("Est as avanzando en tu trabajo; podrias verdaderamente brillar, pero  eres tan inestable! La gente tendr a sus dudas sobre ti");
			if (op_mag==82)
			System.out.println("Con tu relacion de pareja o familiar, encontrar as la armonia y ternura que necesitas. ¿Soltero? Aprender as que alguien cercano a ti te ama desde hace mucho tiempo");
			if (op_mag==83)
			System.out.println("La atmosfera en el trabajo ser a mala. Consuelate en saber que no te afectar a directamente. Es importante saber ver al pasado y analizarlo sin ser complaciente. ");
			if (op_mag==84)
			System.out.println("Disputas inevitables surgen. Las cosas no ser an tranquilas entre tu pareja y tu. ¿Soltero? Si conoces a alguien, no esperes demasiado de un encuentro");
			if (op_mag==85)
			System.out.println("Tendr as una tendencia a sonar. L astima, porque tienes el viento en tus velas. Tienes todo lo que se necesita para triunfar,  actua! ");
			if (op_mag==86)
			System.out.println("Disfrutar as una renovada pasion entre tu pareja y tu -- aun m as porque no han dejado de amarse. Si eres soltero, tal vez conozcas a tu alma gemela.");
			if (op_mag==87)
			System.out.println("Tienes la oportunidad de resaltar. Toma nota: seria mejor comenzar lentamente y luego apretar el paso. Conserva tu energia. ");
			if (op_mag==88)
			System.out.println("Ya sea con tu familia o tu pareja, ser as consentido. Descubrir as que tu pareja y tu comparten gustos similares cuando se trata de ciertas cosas. Si eres soltero y tu familia no esta cerca, un amigo ser a un buen sustituto");
			if (op_mag==89)
			System.out.println("Te ir a bien. Eso es bueno, porque otros esperan mucho cuando se trata de tus habilidades profesionales. Podrias recibir buenos consejos cuando se trata de un asunto en particular");
			if (op_mag==90)
			System.out.println("Te sentir as satisfecho y rom antico con la persona que te ama. Tienes buenas cartas,  pero tambien debes aprender a jugar el juego! ");
			if (op_mag==91)
			System.out.println("Las cosas estaban yendo bien, pero ahora  vuelan! Cada dia trae avances. Ahora, uno se pregunta hasta donde puedes llegar");
			if (op_mag==92)
			System.out.println("Una sensacion de afecto que has compartido con alguien te hace muy feliz. Son fieles y leales. Parece que has encontrado el verdadero amor");
			if (op_mag==93)
			System.out.println("Est as lleno de criticas para ti mismo; sabes como destruir lo que has establecido al ir a los extremos. Recuerda que la perfeccion no existe en este mundo");
			if (op_mag==94)
			System.out.println("Eliges acercarte a otros y darle prioridad a la comunicacion y el di alogo. Prefieres la compania de tu familia -- especialmente la compania de tu pareja");
			if (op_mag==95)
			System.out.println("Otros se sorprender a por el hecho de que estas en otro planeta muy seguido. Al principio les parecer a gracioso, pero tu falta de concentracion ser a menos popular despues de un rato. Organizate");
			if (op_mag==96)
			System.out.println("Si eres casado, necesitar as cultivar una relacion m as profunda con tu pareja. ¿Soltero? Ser as selectivo. En cuanto a tus amigos, establecer as prioridades, y eso es bueno");
			if (op_mag==97)
			System.out.println("Las estrellas te traen momentos dificiles. De pronto, todo lo que emprendes parece destinado a ser una lucha. Proyectos en conjunto fallar an, pero no te alteres por ello");
			if (op_mag==98)
			System.out.println("Necesitas seguridad y estabilidad en tus intercambios con otros. No te desilusionar as. Recibes mucho afecto y amabilidad");
			if (op_mag==99)
			System.out.println("La atmosfera es clara y limpia. Puedes avanzar las cosas y hasta firmar contratos. No esperes; realiza un compromiso. Lograr as tomar una decision financiera, apoyado por ideas perfectamente solidas");

			}
			System.out.println("");
			System.out.print("Desea otro horoscopo? 1)Si 2)No =>");
			other = Leer.datoint();

			if (other==2)
			{
				otro=false;
			}
		}
	}
}

