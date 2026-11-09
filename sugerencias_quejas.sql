-- phpMyAdmin SQL Dump
-- version 3.2.4
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 19-05-2019 a las 00:46:05
-- Versión del servidor: 5.1.41
-- Versión de PHP: 5.3.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `sugerencias_quejas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `accesos`
--

CREATE TABLE IF NOT EXISTS `accesos` (
  `id_usuario` varchar(5) NOT NULL,
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `accesos`
--


-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `incidencias`
--

CREATE TABLE IF NOT EXISTS `incidencias` (
  `id_incidencia` int(11) NOT NULL AUTO_INCREMENT,
  `id_tipo_incidencia` int(11) NOT NULL,
  `nombre_cliente` varchar(100) NOT NULL,
  `direccion_cliente` varchar(100) NOT NULL,
  `edad_cliente` int(11) NOT NULL,
  `telefono_cliente` varchar(12) NOT NULL,
  `descripcion_cliente` varchar(150) NOT NULL,
  `id_gestor` varchar(5) NOT NULL,
  `id_tipo_estado` int(11) NOT NULL,
  `estado` varchar(11) NOT NULL,
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id_incidencia`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Volcar la base de datos para la tabla `incidencias`
--

INSERT INTO `incidencias` (`id_incidencia`, `id_tipo_incidencia`, `nombre_cliente`, `direccion_cliente`, `edad_cliente`, `telefono_cliente`, `descripcion_cliente`, `id_gestor`, `id_tipo_estado`, `estado`, `fecha`) VALUES
(1, 1, 'Jessica', 'Mariano', 19, '111111', 'a', '8e.', 2, 'activo', '2019-05-18 20:15:09'),
(2, 2, 'Marina', 'Aquiles S', 22, '112233', 'bb', '8e.', 1, 'activo', '2019-05-18 17:26:07'),
(3, 1, 'Elizabeth', 'Mariano Matamoros', 19, '852963', 'sdaas', '8e.', 2, 'inactivo', '2019-05-18 22:39:28'),
(4, 2, 'Rodrigo', 'Mariano', 53, '888888', 'asdfg', '0i+', 2, 'activo', '2019-05-18 22:38:23');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `movimiento_gestor`
--

CREATE TABLE IF NOT EXISTS `movimiento_gestor` (
  `id_movimiento` int(11) NOT NULL AUTO_INCREMENT,
  `id_tipo_movimiento` int(11) NOT NULL,
  `id_gestor` varchar(5) NOT NULL,
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id_movimiento`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=22 ;

--
-- Volcar la base de datos para la tabla `movimiento_gestor`
--

INSERT INTO `movimiento_gestor` (`id_movimiento`, `id_tipo_movimiento`, `id_gestor`, `fecha`) VALUES
(1, 1, '8e.', '2019-05-18 17:16:36'),
(2, 1, '8e.', '2019-05-18 17:26:09'),
(3, 2, '7i%', '2019-05-18 18:13:26'),
(4, 3, '7i%', '2019-05-18 18:14:32'),
(5, 4, '7i%', '2019-05-18 18:14:49'),
(6, 4, '7i%', '2019-05-18 18:14:53'),
(7, 3, '7x&', '2019-05-18 18:51:43'),
(8, 3, '7x&', '2019-05-18 18:51:56'),
(9, 3, '7x&', '2019-05-18 18:52:07'),
(10, 3, '5t/', '2019-05-18 18:57:35'),
(11, 3, '5t/', '2019-05-18 19:03:00'),
(12, 3, '0c&', '2019-05-18 20:14:40'),
(13, 2, '0c&', '2019-05-18 20:15:10'),
(14, 4, '0c&', '2019-05-18 20:15:22'),
(15, 4, '0c&', '2019-05-18 20:15:30'),
(16, 4, '0c&', '2019-05-18 20:16:11'),
(17, 4, '0c&', '2019-05-18 20:16:16'),
(18, 1, '8e.', '2019-05-18 22:12:46'),
(19, 1, '0i+', '2019-05-18 22:38:25'),
(20, 2, '0i+', '2019-05-18 22:39:29'),
(21, 3, '0i+', '2019-05-18 22:39:59');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_estado`
--

CREATE TABLE IF NOT EXISTS `tipo_estado` (
  `id_tipo_estado` varchar(20) NOT NULL,
  `descripcion` varchar(20) NOT NULL,
  PRIMARY KEY (`id_tipo_estado`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `tipo_estado`
--

INSERT INTO `tipo_estado` (`id_tipo_estado`, `descripcion`) VALUES
('1', 'En espera'),
('2', 'Urgencia');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_incidencia`
--

CREATE TABLE IF NOT EXISTS `tipo_incidencia` (
  `id_tipo_incidencia` int(11) NOT NULL,
  `descripcion` varchar(20) NOT NULL,
  PRIMARY KEY (`id_tipo_incidencia`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `tipo_incidencia`
--

INSERT INTO `tipo_incidencia` (`id_tipo_incidencia`, `descripcion`) VALUES
(1, 'Queja'),
(2, 'Sugerencia');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_movimiento`
--

CREATE TABLE IF NOT EXISTS `tipo_movimiento` (
  `id_tipo_movimiento` int(11) NOT NULL,
  `descripcion` varchar(20) NOT NULL,
  PRIMARY KEY (`id_tipo_movimiento`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `tipo_movimiento`
--

INSERT INTO `tipo_movimiento` (`id_tipo_movimiento`, `descripcion`) VALUES
(1, 'Alta'),
(2, 'Baja'),
(3, 'Modificar'),
(4, 'Consultar');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_turno`
--

CREATE TABLE IF NOT EXISTS `tipo_turno` (
  `id_tipo_turno` int(11) NOT NULL,
  `descripcion` varchar(20) NOT NULL,
  PRIMARY KEY (`id_tipo_turno`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `tipo_turno`
--

INSERT INTO `tipo_turno` (`id_tipo_turno`, `descripcion`) VALUES
(1, 'Matutino'),
(2, 'Vespertino');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_usuarios`
--

CREATE TABLE IF NOT EXISTS `tipo_usuarios` (
  `id_tipo_usuario` int(11) NOT NULL,
  `descripcion` varchar(20) NOT NULL,
  PRIMARY KEY (`id_tipo_usuario`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `tipo_usuarios`
--

INSERT INTO `tipo_usuarios` (`id_tipo_usuario`, `descripcion`) VALUES
(1, 'Administrador'),
(2, 'Gestor');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE IF NOT EXISTS `usuarios` (
  `id_usuario` varchar(5) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `edad` int(11) NOT NULL,
  `contrasena` varchar(7) NOT NULL,
  `nacionalidad` varchar(20) NOT NULL,
  `id_turno` int(11) NOT NULL,
  `fecha` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `id_tipo_usuario` int(11) NOT NULL,
  `activo` int(11) NOT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcar la base de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `nombre`, `edad`, `contrasena`, `nacionalidad`, `id_turno`, `fecha`, `id_tipo_usuario`, `activo`) VALUES
('A1&', 'Diana Gonzalez', 20, 'DIA123G', 'México', 1, '2019-03-16 20:53:46', 1, 0),
('7i%', 'Diana Patricia Gonzalez flores', 20, 'Dia75', 'Mexicana', 2, '2019-04-18 15:43:05', 2, 1),
('7e.', 'Sofia Reyes', 25, 'sof72', 'Venezolana', 1, '2019-04-18 15:46:09', 2, 1),
('0m&', 'Sofia Reyes', 25, 'sof01', 'Venezolana', 1, '2019-04-18 15:46:48', 2, 1),
('4s$', '       ', 45, '   53', 'mexa', 1, '2019-04-18 16:16:36', 2, 1),
('0r"', 'gdfg', 50, 'gdf52', '      ', 1, '2019-04-18 16:18:38', 2, 1),
('7x&', 'Diana Patricia', 20, 'dia89', 'Mexicana', 1, '2019-04-18 19:11:40', 2, 1),
('0i+', 'Sofia', 34, 'sof12', 'mexicana', 1, '2019-04-18 19:16:40', 2, 1),
('8e.', 'Diana Rodriguez espiricueta', 40, 'dia36', 'frances', 1, '2019-04-18 20:36:18', 2, 1),
('0c&', 'JNjnjnfds', 40, 'jnj65', 'mexa', 1, '2019-04-18 20:45:57', 2, 1),
('5t/', 'fhbfghjgj', 4, 'fhb43', 'hbnhvghnv', 1, '2019-04-18 20:54:52', 2, 1),
('6f*', 'dfgdfghf', 40, 'dfg17', 'vgvghn', 2, '2019-04-18 20:59:22', 2, 1),
('7m"', 'ghgjghj', 50, 'ghg38', 'gfcfgcfg', 1, '2019-04-18 21:00:51', 2, 1);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
