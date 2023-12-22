<p>Realisée par : ESSABIR HAJAR</p>
<p>_________________________________________________________________________________________________
<h1>Rapport de TP1 : Inversion de Contrôle et Injection des dépendances</h1>
<h2 style="color:skyblue">Introduction</h2>
<p>Ce présent rapport se penche sur les fondements théoriques de l'Inversion de Contrôle (IoC) et de l'Injection de Dépendances (DI) dans le contexte du développement logiciel. Ces concepts, au cœur des préoccupations actuelles en matière de conception logicielle, visent à améliorer la modularité, la testabilité et la maintenabilité des applications. À travers une analyse approfondie, nous explorerons les avantages substantiels, les justifications sous-jacentes, et les implications pratiques de l'IoC et de la DI. </p>
<h2 style="color: skyblue">Conception</h2>
<h3>Principe du couplage faible</h3>
<img src="captures/conception.png" alt="conception image">
<p>
L'utilisation d'interfaces revêt une importance cruciale dans la minimisation du lien fort entre les différentes classes. Par exemple, en associant MetierImpl à l'interface IDao, on instaure un lien souple. Ainsi, MetierImpl peut interagir avec n'importe quelle classe respectant les règles définies par IDao sans qu'il soit nécessaire de modifier directement MetierImpl. Cette approche confère une flexibilité accrue au système et accroît sa résilience face à des changements internes, favorisant ainsi la conception d'applications robustes et adaptables.
</p>
<p>
Le choix d'un couplage souple conduit généralement à la création d'applications qualifiées de « fermées pour modification » (où les classes existantes demeurent inchangées) et « ouvertes pour extension » (offrant la possibilité d'ajouter de nouvelles classes respectant l'interface sans perturber le fonctionnement des classes déjà en place
</p>
<h2 style="color: Skyblue">Captures d'écrans</h2>
<h3>Création de l'interface IDao</h3>
<img src="captures/idao.png" alt="interface IDao">
<h3>Création d'une implémentation de l'interface IDao version Base de Données</h3>
<img src="captures/daoimpl.png" alt="impl version base de données">
<h3>Création d'une implémentation de l'interface IDao version web services</h3>
<img src="captures/daoimplV2.png" alt="IDapImpl version web services">
<hr>
<h3>Création de l'interface IMetier</h3>
<img src="captures/imetier.png" alt="IMetier">
<h3>Création d'une implémentation de l'interface IMetier</h3>
<img src="captures/metierimpl.png" alt="implementation de IMetier">
<h3>Instantiation statique</h3>
<img src="captures/Pres1.png" alt="instantiation statique">
<h3>Instantiation dynamique</h3>
<img src="captures/Pres2.png" alt="instantiation dynamique">
<p>L'ajout d'un fichier "config.txt" :</p>
<img src="captures/config_txt.png" alt="config.txt">
<h3>Injection des dépendances en utilisant Spring version xml</h3>
<img src="captures/config_xml.png" alt="config.xml">
<img src="captures/spring_xml.png" alt="spring version xml">
<h3>Injection des dépendances en utilisant Spring version annotations</h3>
<p>Repository Class</p>
<p>@Repository : Cette annotation signale que la classe est un composant de persistance, couramment employé pour les opérations d'accès aux données.</p>
<img src="captures/daoimpl.png" alt="repository class">
<p>Service Class</p>
<p>@Service : Cette annotation sert à identifier une classe en tant que service. Les classes de service intègrent la logique métier de l'application. Les classes annotées avec @Service sont repérées et gérées par Spring.</p>
<img src="captures/metierimpl.png" alt="service">
<p>Controller</p>
<p>@Controller : Cette annotation est utilisée pour marquer une classe en tant que contrôleur dans le contexte Spring MVC.</p>
<img src="captures/spring_annotation.png" alt="i">
<h2 style="color:skyblue">Conclusion</h2>
<p>
En conclusion, cette étude approfondie a examiné de près les principes clés de l'inversion de contrôle (IoC) et de l'injection de dépendances (DI) dans le domaine du développement logiciel. Les implications de ces concepts sur la modularité, la testabilité et la maintenabilité des applications ont été soigneusement analysées. Les exemples pratiques ont illustré la réduction du couplage grâce à l'utilisation d'interfaces et à l'intégration du Spring Framework. Comprendre et appliquer ces principes s'avère essentiel pour concevoir des applications flexibles, adaptables aux changements internes, et constitue un socle robuste pour le développement de logiciels modernes.
</p>