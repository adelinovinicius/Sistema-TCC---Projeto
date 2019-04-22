-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           5.5.5-10.1.38-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              8.0.0.4477
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Copiando estrutura do banco de dados para dbmercadinho

-- Copiando estrutura para tabela dbmercadinho.cliente
CREATE TABLE IF NOT EXISTS `cliente` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `NomeCliente` varchar(225) NOT NULL,
  `Email` varchar(225) NOT NULL,
  `CPFCliente` varchar(20) NOT NULL,
  `TelefoneCliente` varchar(20) NOT NULL,
  `SexoCliente` varchar(20) DEFAULT NULL,
  `RuaCliente` varchar(20) NOT NULL,
  `NumeroCliente` int(10) NOT NULL,
  `BairroCliente` varchar(255) DEFAULT NULL,
  `CidadeCliente` varchar(20) DEFAULT NULL,
  `CEPCliente` varchar(20) NOT NULL,
  `UFCliente` varchar(3) DEFAULT NULL,
  PRIMARY KEY (`idCliente`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela dbmercadinho.cliente: ~1 rows (aproximadamente)

INSERT INTO `cliente` (`idCliente`, `NomeCliente`, `Email`, `CPFCliente`, `TelefoneCliente`, `SexoCliente`, `RuaCliente`, `NumeroCliente`, `BairroCliente`, `CidadeCliente`, `CEPCliente`, `UFCliente`) VALUES
	(38, 'Vinicius Adelino Ferreira', 'vini.adelino@gmail.com', '440.576.908-75', '(19) 93883-7093', 'Masculino', 'Rua Aquidaba', 5000, 'Parque Residencial Florença', 'Sumaré', '13171400', 'SP');

-- Copiando estrutura para tabela dbmercadinho.compras
CREATE TABLE IF NOT EXISTS `compras` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `ID_Cliente` int(11) NOT NULL,
  `ID_Produto` int(11) NOT NULL,
  `ID_Loja` int(11) NOT NULL,
  `descrição` varchar(255) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `valor` double(10,2) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


-- Copiando estrutura para tabela dbmercadinho.entregador
CREATE TABLE IF NOT EXISTS `entregador` (
  `identregador` int(11) NOT NULL AUTO_INCREMENT,
  `nomeEntregador` varchar(255) NOT NULL,
  `emailEntregador` varchar(45) NOT NULL,
  `telefoneEntregador` varchar(20) NOT NULL,
  `CNHEntregador` varchar(45) NOT NULL,
  `cidadeEntregador` varchar(45) NOT NULL,
  `UFEntregador` varchar(3) NOT NULL,
  `cepEntregador` varchar(20) DEFAULT NULL,
  `ruaEntregador` varchar(50) DEFAULT NULL,
  `numeroEntregador` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`identregador`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


-- Copiando estrutura para tabela dbmercadinho.loja
CREATE TABLE IF NOT EXISTS `loja` (
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
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela dbmercadinho.loja: ~1 rows (aproximadamente)

INSERT INTO `loja` (`idLoja`, `nomeLoja`, `CNPJLoja`, `foneLoja`, `emailLoja`, `taxaDeEntregaLoja`, `CEPLoja`, `numeroLoja`, `RuaLoja`, `bairroLoja`, `CidadeLoja`, `UFLoja`) VALUES
	(1, 'Sorveteria', '00.000.000/0000-00', '(55) 95555-5555', 'ghcjcgj', 5.50, '13171390', 238, 'Rua Brás Cubas', 'Parque Residencial Florença', 'Sumaré', 'SP'),
	(2, 'BAR E SORVETERIA SKINÃO', '66.161.604/6804-23', '(19) 3883-7023', 'SKINÃO@HOTMAIL.COM', 5.00, '13171400', 20, 'Rua Aquidaba', 'Parque Residencial Florença', 'Sumaré', 'SP');


-- Copiando estrutura para tabela dbmercadinho.produto
CREATE TABLE IF NOT EXISTS `produto` (
  `idProduto` int(11) NOT NULL AUTO_INCREMENT,
  `nomeProduto` varchar(255) NOT NULL,
  `qtdProduto` int(11) NOT NULL,
  `valorProduto` double(10,2) NOT NULL,
  `idlojaproprietaria` int(10) DEFAULT NULL,
  PRIMARY KEY (`idProduto`),
  KEY `codLojaProprietaria` (`idlojaproprietaria`),
  CONSTRAINT `codLojaProprietaria` FOREIGN KEY (`idlojaproprietaria`) REFERENCES `loja` (`idLoja`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- Copiando dados para a tabela dbmercadinho.produto: ~0 rows (aproximadamente)

INSERT INTO `produto` (`idProduto`, `nomeProduto`, `qtdProduto`, `valorProduto`, `idlojaproprietaria`) VALUES
	(1, 'Sabonete', 10, 100.00, 1),
	(2, 'Jose', 10, 10.00, 2);

-- Copiando estrutura para tabela dbmercadinho.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `idUsuario` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(255) NOT NULL,
  `senha` varchar(20) NOT NULL,
  `tipoUsuario` varchar(20) NOT NULL,
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Copiando dados para a tabela dbmercadinho.usuario: ~2 rows (aproximadamente)

INSERT INTO `usuario` (`idUsuario`, `usuario`, `senha`, `tipoUsuario`) VALUES
	(1, '1', '1', 'Cliente');
	(2, '2', '2', 'Loja');



