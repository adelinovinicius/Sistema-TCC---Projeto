CREATE DATABASE  IF NOT EXISTS `dbmercadinho` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `dbmercadinho`;
-- MySQL dump 10.16  Distrib 10.1.38-MariaDB, for Win64 (AMD64)
--
-- Host: 127.0.0.1    Database: dbmercadinho
-- ------------------------------------------------------
-- Server version	10.1.38-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `NomeCliente` varchar(225) NOT NULL,
  `Email` varchar(225) NOT NULL,
  `CPFCliente` varchar(20) NOT NULL,
  `TelefoneCliente` varchar(20) NOT NULL,
  `SexoCliente` varchar(20) DEFAULT NULL,
  `RuaCliente` varchar(20) NOT NULL,
  `NumeroCliente` int(10) NOT NULL,
  `BairroCliente` varchar(20) DEFAULT NULL,
  `CidadeCliente` varchar(20) DEFAULT NULL,
  `CEPCliente` varchar(20) NOT NULL,
  `UFCliente` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (16,'Jose','gfhgfhfgh','000.000.000-00','(00) 90000-0000','Outro','ghgfh',80,'gfhfgh','gfhfghgf','00000-000','PA'),(17,'JOse','gfhgfhfgh','000.000.000-00','(00) 90000-0000','Feminino','ghgfh',80,'gfhfgh','gfhfghgf','00000-000','AP'),(20,'JOse','gfhgfhfgh','000.000.000-00','(00) 90000-0000','Feminino','ghgfh',80,'gfhfgh','gfhfghgf','00000-000','AP'),(21,'JOse','gfhgfhfgh','000.000.000-00','(00) 90000-0000','Feminino','ghgfh',80,'gfhfgh','gfhfghgf','00000-000','AP'),(22,'JOse','gfhgfhfgh','000.000.000-00','(00) 90000-0000','Feminino','ghgfh',80,'gfhfgh','gfhfghgf','00000-000','AP'),(23,'Vinicius','gfhgfhfgh','000.000.000-00','(00) 90000-0000','Outro','ghgfh',80,'gfhfgh','gfhfghgf','00000-000','PA'),(24,'JOse','gfhgfhfgh','000.000.000-00','(00) 90000-0000','Feminino','ghgfh',80,'gfhfgh','gfhfghgf','00000-000','AP'),(25,'Vinicius','gfhgfhfgh','000.000.000-00','(00) 90000-0000','Masculino','ghgfh',80,'gfhfgh','gfhfghgf','00000-000','PA'),(26,'Jose','gfhgfhfgh','000.000.000-00','(00) 90000-0000','Outro','ghgfh',80,'gfhfgh','gfhfghgf','00000-000','PA'),(27,'JOse','gfhgfhfgh','000.000.000-00','(00) 90000-0000','Feminino','ghgfh',80,'gfhfgh','gfhfghgf','00000-000','AP'),(28,'JOse','gfhgfhfgh','000.000.000-00','(00) 90000-0000','Feminino','ghgfh',80,'gfhfgh','gfhfghgf','00000-000','AP'),(29,'Vinicius','gfhgfhfgh','000.000.000-00','(00) 90000-0000','Outro','ghgfh',80,'gfhfgh','gfhfghgf','00000-000','PA'),(30,'JOse','gfhgfhfgh','000.000.000-00','(00) 90000-0000','Feminino','ghgfh',80,'gfhfgh','gfhfghgf','00000-000','AP'),(31,'JOse','gfhgfhfgh','000.000.000-00','(00) 90000-0000','Feminino','ghgfh',80,'gfhfgh','gfhfghgf','00000-000','AP'),(32,'c','c','000.000.000-00','(  ) 9    -    ','Feminino','c',0,'~ç','kç','00000-000','AP');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entregador`
--

DROP TABLE IF EXISTS `entregador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `entregador` (
  `identregador` int(11) NOT NULL AUTO_INCREMENT,
  `nomeEntregador` varchar(255) NOT NULL,
  `emailEntregador` varchar(45) NOT NULL,
  `telefoneEntregador` varchar(20) NOT NULL,
  `CNHEntregador` varchar(45) NOT NULL,
  `cidadeEntregador` varchar(45) NOT NULL,
  `UFEntregador` varchar(3) NOT NULL,
  PRIMARY KEY (`identregador`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entregador`
--

LOCK TABLES `entregador` WRITE;
/*!40000 ALTER TABLE `entregador` DISABLE KEYS */;
INSERT INTO `entregador` VALUES (1,'padaria','jose@gmail.com','3883-7093','13171-400','Sumare','SP');
/*!40000 ALTER TABLE `entregador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `loja`
--

DROP TABLE IF EXISTS `loja`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `loja` (
  `idLoja` int(11) NOT NULL AUTO_INCREMENT,
  `nomeLoja` varchar(255) NOT NULL,
  `CNPJLoja` varchar(20) NOT NULL,
  `foneLoja` varchar(20) NOT NULL,
  `emailLoja` varchar(255) NOT NULL,
  `taxaDeEntregaLoja` decimal(10,2) NOT NULL,
  `CEPLoja` varchar(20) NOT NULL,
  `numeroLoja` int(10) NOT NULL,
  `RuaLoja` varchar(45) DEFAULT NULL,
  `bairroLoja` varchar(45) DEFAULT NULL,
  `CidadeLoja` varchar(45) NOT NULL,
  `UFLoja` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`idLoja`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `loja`
--

LOCK TABLES `loja` WRITE;
/*!40000 ALTER TABLE `loja` DISABLE KEYS */;
INSERT INTO `loja` VALUES (2,'Maria Canntina','1306626262622','38837093','vini@gmai.com',5.00,'13171-400',238,'Aquidaba','florença','sumare','CE');
/*!40000 ALTER TABLE `loja` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `produto` (
  `idProduto` int(11) NOT NULL AUTO_INCREMENT,
  `nomeProduto` varchar(255) NOT NULL,
  `qtdProduto` int(11) NOT NULL,
  `valorProduto` double(10,2) NOT NULL,
  `idlojaproprietaria` int(10) DEFAULT NULL,
  PRIMARY KEY (`idProduto`),
  KEY `codLojaProprietaria` (`idlojaproprietaria`),
  CONSTRAINT `codLojaProprietaria` FOREIGN KEY (`idlojaproprietaria`) REFERENCES `loja` (`idLoja`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `idUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(255) DEFAULT NULL,
  `senha` varchar(20) DEFAULT NULL,
  `codidFornecedor` int(11) DEFAULT NULL,
  `codidLoja` int(11) DEFAULT NULL,
  PRIMARY KEY (`idUsuario`),
  KEY `codidFornecedor` (`codidFornecedor`),
  KEY `codidLoja` (`codidLoja`),
  CONSTRAINT `codidFornecedor` FOREIGN KEY (`codidFornecedor`) REFERENCES `entregador` (`identregador`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `codidLoja` FOREIGN KEY (`codidLoja`) REFERENCES `loja` (`idLoja`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'vinicius','adelino',NULL,NULL),(2,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'dbmercadinho'
--

--
-- Dumping routines for database 'dbmercadinho'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-03-17 19:02:02
