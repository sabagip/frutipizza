-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 28-08-2014 a las 16:20:37
-- Versión del servidor: 5.5.8
-- Versión de PHP: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `frutipizza`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE IF NOT EXISTS `compra` (
  `idcompra` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_cliente` varchar(45) NOT NULL,
  `apellido_paterno_cliente` varchar(45) NOT NULL,
  `apellido_materno_cliente` varchar(45) DEFAULT NULL,
  `fecha` datetime NOT NULL,
  `confirmaPedido` int(11) NOT NULL COMMENT 'Indica si el pedido fue aceptado,',
  PRIMARY KEY (`idcompra`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=50 ;

--
-- Volcar la base de datos para la tabla `compra`
--

INSERT INTO `compra` (`idcompra`, `nombre_cliente`, `apellido_paterno_cliente`, `apellido_materno_cliente`, `fecha`, `confirmaPedido`) VALUES
(1, 'Sergio Alan', 'Betancourt ', 'Almanza', '2014-08-26 19:44:43', 0),
(2, 'Laura Alejandra', 'Martinez Ortega', '', '2014-08-26 19:46:54', 1),
(3, 'Te amo', 'mi amor', '', '2014-08-26 19:48:14', 1),
(4, 'asdf', '', '', '2014-08-26 19:49:38', 0),
(5, 'adsf', '', '', '2014-08-26 19:50:54', 0),
(6, 'asdf', '', '', '2014-08-26 19:53:13', 1),
(7, 'fasda', 'fasd', '', '2014-08-26 19:56:39', 0),
(8, 'qwer', 'qwer', '', '2014-08-26 19:57:27', 1),
(9, 'Sergio Alan', 'Betancourt', 'Almanza', '2014-08-27 17:59:09', 0),
(10, 'Sergio Alan', 'Betancourt ', 'Almanza', '2014-08-27 18:01:19', 0),
(11, 'ads', '', '', '2014-08-27 18:57:41', 0),
(12, 'asdf', '', '', '2014-08-27 18:58:43', 0),
(13, 'sdfg', '', '', '2014-08-27 18:59:32', 0),
(14, 'asdf', '', '', '2014-08-27 19:00:06', 0),
(15, 'ad', '', '', '2014-08-27 19:01:48', 0),
(16, 'asd', '', '', '2014-08-27 19:22:50', 0),
(17, 'asdf', '', '', '2014-08-27 19:23:58', 0),
(18, 'asdf', '', '', '2014-08-27 19:31:14', 0),
(19, 'asdf', '', '', '2014-08-27 19:45:49', 0),
(20, 'ser', '', '', '2014-08-27 19:49:07', 0),
(21, 'asdf', '', '', '2014-08-27 19:50:12', 0),
(22, 'asdf', '', '', '2014-08-27 19:53:39', 0),
(23, 'asdf', '', '', '2014-08-27 19:54:54', 0),
(24, 'asdf', '', '', '2014-08-27 19:59:16', 0),
(25, 'asdf', '', '', '2014-08-27 19:59:59', 0),
(26, 'asdf', '', '', '2014-08-27 20:01:13', 0),
(27, 'asdf', '', '', '2014-08-27 20:03:21', 0),
(28, 'asdf', '', '', '2014-08-27 20:07:15', 0),
(29, 'asdf', '', '', '2014-08-27 23:14:55', 0),
(30, 'asdf', '', '', '2014-08-27 23:47:08', 0),
(31, 'asdf', '', '', '2014-08-27 23:50:46', 0),
(32, 'asdf', '', '', '2014-08-27 23:52:22', 0),
(33, 'asdf', '', '', '2014-08-28 00:01:34', 0),
(34, 'asdf', '', '', '2014-08-28 00:05:29', 0),
(35, 'asdf', '', '', '2014-08-28 00:08:11', 0),
(36, 'asdf', '', '', '2014-08-28 00:09:44', 0),
(37, 'asdf', '', '', '2014-08-28 00:10:44', 0),
(38, 'asdf', '', '', '2014-08-28 00:16:51', 0),
(39, 'adsf', '', '', '2014-08-28 00:19:38', 0),
(40, 'asdf', '', '', '2014-08-28 00:23:58', 0),
(41, 'asdf', '', '', '2014-08-28 00:25:11', 0),
(42, 'asdf', '', '', '2014-08-28 00:27:10', 0),
(43, 'asdf', '', '', '2014-08-28 00:27:59', 0),
(44, 'asdf', '', '', '2014-08-28 00:29:01', 0),
(45, 'sergio', '', '', '2014-08-28 10:07:26', 0),
(46, 'adf', '', '', '2014-08-28 10:09:55', 0),
(47, 'asdf', '', '', '2014-08-28 10:10:22', 0),
(48, 'asdf', '', '', '2014-08-28 10:11:56', 0),
(49, 'asdf', '', '', '2014-08-28 10:12:54', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_compra`
--

CREATE TABLE IF NOT EXISTS `detalle_compra` (
  `iddetalle_compra` int(11) NOT NULL AUTO_INCREMENT,
  `idcompra` int(11) NOT NULL,
  `ingredientes` varchar(45) NOT NULL,
  `cantidad_pizza` int(11) NOT NULL,
  `tamanio` varchar(45) NOT NULL,
  `totalPizza` float NOT NULL,
  PRIMARY KEY (`iddetalle_compra`),
  KEY `fk_detalle_compra_compra` (`idcompra`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=21 ;

--
-- Volcar la base de datos para la tabla `detalle_compra`
--

INSERT INTO `detalle_compra` (`iddetalle_compra`, `idcompra`, `ingredientes`, `cantidad_pizza`, `tamanio`, `totalPizza`) VALUES
(1, 1, 'galleta, durazno,manzana', 2, ' chica ', 160),
(2, 1, 'harina, pina,platano,mango', 4, ' grande ', 408),
(3, 2, 'galleta, pina,fresa,manzana', 1, ' chica ', 113),
(4, 2, 'harina, pina,kiwi,manzana', 3, ' grande ', 264),
(5, 3, 'galleta, durazno,fresa', 1, ' grande ', 89),
(6, 3, 'harina, manzana,kiwi', 2, ' individual ', 142),
(7, 4, 'galleta, fresa,manzana,durazno', 2, ' chica ', 210),
(8, 5, 'galleta, fresa,manzana,durazno', 3, ' chica ', 315),
(9, 6, 'galleta, fresa,durazno,manzana', 2, ' grande ', 210),
(10, 7, 'galleta, fresa,durazno,manzana', 3, ' chica ', 315),
(11, 8, 'galleta, mango,manzana,durazno', 4, ' grande ', 420),
(12, 44, 'galleta, fresa,pina,platano,galleta', 1, ' mediana ', 57),
(13, 45, 'galleta, kiwi,mango,platano,galleta', 5, ' grande ', 430),
(14, 45, 'harina, fresa,pina,mango,harina', 2, ' individual ', 41),
(15, 46, 'durazno,fresa,manzana,galleta', 1, ' chica ', 44),
(16, 47, 'kiwi,mango,platano,harina', 1, ' grande ', 86),
(17, 48, 'galleta, platano,pina,galleta', 1, ' grande ', 76),
(18, 49, 'harina, fresa,pina,platano,harina', 1, ' chica ', 38),
(19, 49, 'harina, fresa,pina,platano,harina', 1, ' grande ', 76),
(20, 49, 'fresa,pina,platano,harina', 1, ' grande ', 76);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ingredientes_chico`
--

CREATE TABLE IF NOT EXISTS `ingredientes_chico` (
  `idingredientes` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  PRIMARY KEY (`idingredientes`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Volcar la base de datos para la tabla `ingredientes_chico`
--

INSERT INTO `ingredientes_chico` (`idingredientes`, `nombre`, `precio`) VALUES
(1, 'harina', 20),
(2, 'galleta', 20),
(3, 'platano', 5),
(4, 'mango', 8),
(5, 'piña', 5),
(6, 'kiwi', 10),
(7, 'fresa', 8),
(8, 'manzana', 8),
(9, 'durazno', 8);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ingredientes_grande`
--

CREATE TABLE IF NOT EXISTS `ingredientes_grande` (
  `idingredientes` int(11) NOT NULL DEFAULT '0',
  `nombre` varchar(45) DEFAULT NULL,
  `precio` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `ingredientes_grande`
--

INSERT INTO `ingredientes_grande` (`idingredientes`, `nombre`, `precio`) VALUES
(1, 'harina', 40),
(2, 'galleta', 40),
(3, 'platano', 10),
(4, 'mango', 16),
(5, 'piña', 10),
(6, 'kiwi', 20),
(7, 'fresa', 16),
(8, 'manzana', 10),
(9, 'durazno', 16);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ingredientes_individual`
--

CREATE TABLE IF NOT EXISTS `ingredientes_individual` (
  `idingredientes` int(11) NOT NULL DEFAULT '0',
  `nombre` varchar(45) DEFAULT NULL,
  `precio` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `ingredientes_individual`
--

INSERT INTO `ingredientes_individual` (`idingredientes`, `nombre`, `precio`) VALUES
(1, 'harina', 10),
(2, 'galleta', 10),
(3, 'platano', 2.5),
(4, 'mango', 4),
(5, 'piña', 2.5),
(6, 'kiwi', 5),
(7, 'fresa', 4),
(8, 'manzana', 4),
(9, 'durazno', 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ingredientes_mediano`
--

CREATE TABLE IF NOT EXISTS `ingredientes_mediano` (
  `idingredientes` int(11) NOT NULL DEFAULT '0',
  `nombre` varchar(45) DEFAULT NULL,
  `precio` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `ingredientes_mediano`
--

INSERT INTO `ingredientes_mediano` (`idingredientes`, `nombre`, `precio`) VALUES
(1, 'harina', 30),
(2, 'galleta', 30),
(3, 'platano', 7.5),
(4, 'mango', 12),
(5, 'piña', 7.5),
(6, 'kiwi', 15),
(7, 'fresa', 12),
(8, 'manzana', 12),
(9, 'durazno', 12);

--
-- Filtros para las tablas descargadas (dump)
--

--
-- Filtros para la tabla `detalle_compra`
--
ALTER TABLE `detalle_compra`
  ADD CONSTRAINT `fk_detalle_compra_compra` FOREIGN KEY (`idcompra`) REFERENCES `compra` (`idcompra`) ON DELETE NO ACTION ON UPDATE NO ACTION;
