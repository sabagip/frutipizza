-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 22-08-2014 a las 23:50:33
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
  PRIMARY KEY (`idcompra`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=78 ;

--
-- Volcar la base de datos para la tabla `compra`
--

INSERT INTO `compra` (`idcompra`, `nombre_cliente`, `apellido_paterno_cliente`, `apellido_materno_cliente`, `fecha`) VALUES
(1, 'Laura Alejandra ', 'Martinez ', 'Ortega', '2014-08-17 16:49:18'),
(2, 'asdf', 'asd', 'asd', '2014-08-17 16:50:15'),
(3, 'yea', 'yea', 'yea', '2014-08-17 17:51:01'),
(4, 'sergio', 'asd', '', '2014-08-17 18:04:25'),
(5, 'sdaf', 'adsf', 'adsf', '2014-08-17 18:05:03'),
(6, 'asdvf', 'aasdv', 'adv', '2014-08-17 18:06:56'),
(7, ',m', 'm', ',k', '2014-08-17 18:29:47'),
(8, 'j', '', '', '2014-08-17 18:31:30'),
(9, 's', '', '', '2014-08-17 18:32:47'),
(10, 'k', '', '', '2014-08-17 18:33:39'),
(11, 'f', '', '', '2014-08-17 18:43:54'),
(12, 'asd', '', '', '2014-08-17 18:45:27'),
(13, 'a', 'a', '', '2014-08-17 18:48:30'),
(14, 'ssdf', '', '', '2014-08-17 18:50:46'),
(15, 'm', '', '', '2014-08-17 18:53:19'),
(16, 'we', '', '', '2014-08-17 18:55:11'),
(17, 'mm', '', '', '2014-08-17 18:58:14'),
(18, 'jj', '', '', '2014-08-17 19:16:21'),
(19, 'a', '', '', '2014-08-17 19:17:13'),
(20, 'l', '', '', '2014-08-17 19:18:15'),
(21, 'w', '', '', '2014-08-17 19:18:45'),
(22, 'Sergio Alan', 'Betancourt ', 'Almanza', '2014-08-21 19:11:04'),
(23, 'Laura Alejandra', 'Martinez O', '', '2014-08-21 19:15:59'),
(24, 'laura', 'martinez', '', '2014-08-21 19:16:47'),
(25, 'sergio', 'sadf', 'asdf', '2014-08-21 19:21:39'),
(26, 'edgar', '', '', '2014-08-21 19:23:26'),
(27, 'adf', 'asdf', 'dfafd', '2014-08-21 19:23:59'),
(28, 'erwt', 'wert', 'wert', '2014-08-21 19:25:41'),
(29, 'Guillermina ', 'Almanza', 'Sanchez', '2014-08-21 19:30:40'),
(30, 'Veronica', 'Betancourt', 'Almanza', '2014-08-21 19:34:21'),
(31, 'sergio', 'null', 'null', '2014-08-21 22:49:13'),
(32, 'Mi amor', 'Te amo', 'Inmensamente', '2014-08-21 22:50:33'),
(33, 'yea yea', '', '', '2014-08-21 22:51:18'),
(34, 'sergio', '', '', '2014-08-21 23:57:53'),
(35, 'asdf', '', '', '2014-08-21 23:59:10'),
(36, 'asdf', 'sadf', 'asd', '2014-08-21 23:59:55'),
(37, 'wer', '', '', '2014-08-22 00:02:01'),
(38, 'wd', '', '', '2014-08-22 00:03:28'),
(39, 'sdf', '', '', '2014-08-22 00:09:11'),
(40, 'ewrt', '', '', '2014-08-22 00:31:48'),
(41, 'asdf', 'asdf', '', '2014-08-22 00:32:59'),
(42, 'asdf', 'asfd', 'asdf', '2014-08-22 00:36:05'),
(43, 'wqer', 'wqre', 'wqer', '2014-08-22 00:36:45'),
(44, 'xcvb', 'xcvb', 'xcvb', '2014-08-22 00:37:19'),
(45, 'sergui', 'asdf', 'adf', '2014-08-22 00:40:49'),
(46, 'adf', 'asdf', 'adf', '2014-08-22 00:43:26'),
(47, 'wer+we', 'wer', '', '2014-08-22 00:45:24'),
(48, 'mama', 'mamam}', '', '2014-08-22 00:45:46'),
(49, 'a', '', '', '2014-08-22 00:47:02'),
(50, 'ert', '', '', '2014-08-22 00:48:31'),
(51, 'wr', 'wer', 'r', '2014-08-22 00:54:08'),
(52, 'l', '', '', '2014-08-22 00:55:19'),
(53, 'asdf', '', '', '2014-08-22 00:58:37'),
(54, 'a', '', '', '2014-08-22 00:59:48'),
(55, 'a', '', '', '2014-08-22 01:00:23'),
(56, 'k', '', '', '2014-08-22 01:01:41'),
(57, 'y', '', '', '2014-08-22 01:02:20'),
(58, 'w', '', '', '2014-08-22 01:03:05'),
(59, 'm', '', '', '2014-08-22 01:04:11'),
(60, 's', '', '', '2014-08-22 01:04:51'),
(61, 'k', '', '', '2014-08-22 01:07:58'),
(62, 'hdf', '', '', '2014-08-22 01:08:18'),
(63, 'e', '', '', '2014-08-22 01:09:27'),
(64, 'j', 'j', '', '2014-08-22 01:10:34'),
(65, 'd', '', '', '2014-08-22 01:12:52'),
(66, 'a', '', '', '2014-08-22 01:18:01'),
(67, 'l', '', '', '2014-08-22 01:18:32'),
(68, 'r', '', '', '2014-08-22 01:19:26'),
(69, 'd', '', '', '2014-08-22 01:21:12'),
(70, 'asdf', '', '', '2014-08-22 01:23:35'),
(71, 'x', '', '', '2014-08-22 01:25:24'),
(72, 'w', '', '', '2014-08-22 01:27:32'),
(73, 'd', '', '', '2014-08-22 01:28:23'),
(74, 's', '', '', '2014-08-22 01:29:11'),
(75, 't', '', '', '2014-08-22 01:29:36'),
(76, 'j', '', '', '2014-08-22 01:30:09'),
(77, 'm', '', '', '2014-08-22 01:31:01');

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
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=29 ;

--
-- Volcar la base de datos para la tabla `detalle_compra`
--

INSERT INTO `detalle_compra` (`iddetalle_compra`, `idcompra`, `ingredientes`, `cantidad_pizza`, `tamanio`, `totalPizza`) VALUES
(1, 8, 'galleta, ', 2, ' chica ', 17820),
(2, 12, 'galleta, pina,fresa,durazno', 2, ' chica ', 424),
(3, 15, 'harina, ', 2, ' chica ', 90),
(4, 16, 'galleta, ', 2, ' chica ', 110),
(6, 22, 'harina, kiwi,durazno,manzana', 2, ' chica ', 80),
(7, 23, 'harina, manzana,durazno,fresa', 3, ' chica ', 95),
(8, 24, 'harina, fresa,durazno,manzana', 3, ' grande ', 95),
(9, 25, 'harina, durazno,manzana', 3, ' chica ', 210),
(10, 26, 'galleta, fresa,fresa,manzana', 1, ' chica ', 0),
(11, 26, 'harina, durazno,manzana,kiwi', 3, ' chica ', 80),
(12, 27, 'galleta, manzana,pina,fresa', 3, ' chica ', 339),
(13, 27, 'galleta, platano,mango,kiwi', 4, ' chica ', 105),
(14, 28, 'galleta, durazno,fresa', 1, ' chica ', 0),
(15, 28, 'galleta, manzana,durazno', 3, ' chica ', 80),
(16, 29, 'harina, manzana', 3, ' chica ', 183),
(17, 29, 'galleta, fresa,durazno,manzana', 4, ' chica ', 105),
(18, 29, 'galleta, durazno,manzana,platano', 1, ' grande ', 95),
(19, 29, 'galleta, fresa,platano', 1, ' chica ', 0),
(20, 29, '', 1, ' chica ', 0),
(21, 30, 'galleta, manzana,durazno,fresa', 1, ' mediana ', 105),
(22, 32, 'galleta, pina,durazno,manzana', 4, ' grande ', 388),
(23, 32, 'harina, manzana,kiwi,platano', 4, ' mediana ', 86),
(24, 33, 'harina, durazno,manzana,pina', 3, ' individual ', 261),
(26, 65, 'galleta, pina,durazno,fresa', 2, ' chica ', 212),
(27, 65, 'galleta, manzana,kiwi,mango', 3, ' chica ', 318),
(28, 65, 'harina, fresa,pina,manzana', 1, ' chica ', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ingredientes`
--

CREATE TABLE IF NOT EXISTS `ingredientes` (
  `idingredientes` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `precio` float DEFAULT NULL,
  PRIMARY KEY (`idingredientes`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=10 ;

--
-- Volcar la base de datos para la tabla `ingredientes`
--

INSERT INTO `ingredientes` (`idingredientes`, `nombre`, `precio`) VALUES
(1, 'harina', 45),
(2, 'galleta', 55),
(3, 'platano', 15),
(4, 'mango', 25),
(5, 'piña', 17),
(6, 'kiwi', 10),
(7, 'fresa', 25),
(8, 'manzana', 16),
(9, 'durazno', 9);

--
-- Filtros para las tablas descargadas (dump)
--

--
-- Filtros para la tabla `detalle_compra`
--
ALTER TABLE `detalle_compra`
  ADD CONSTRAINT `fk_detalle_compra_compra` FOREIGN KEY (`idcompra`) REFERENCES `compra` (`idcompra`) ON DELETE NO ACTION ON UPDATE NO ACTION;
