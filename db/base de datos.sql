-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-10-2021 a las 03:01:41
-- Versión del servidor: 10.4.19-MariaDB
-- Versión de PHP: 7.4.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `relaciones`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personas`
--

CREATE TABLE `personas` (
  `persona_id` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `edad` int(11) NOT NULL,
  `telefono` int(11) NOT NULL,
  `municipio` varchar(30) NOT NULL,
  `relacionadocon` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `personas`
--

INSERT INTO `personas` (`persona_id`, `nombre`, `apellido`, `edad`, `telefono`, `municipio`, `relacionadocon`) VALUES
(1, 'juan', 'villa', 28, 2581037, 'envigado', '5'),
(2, 'santiago', 'arthas', 27, 3502610, 'envigado', '5,6,3'),
(3, 'emanuel', 'gonzales', 18, 3024788, 'itagui', '2,6,7'),
(4, 'alejandro', 'rodas', 20, 5269833, 'la estrella', '7'),
(5, 'maria', 'loaiza', 25, 4457621, 'itagui', '9,1,2,6,8'),
(6, 'valentina', 'garcia', 30, 6598047, 'la estrella', '2,3,7,8,5'),
(7, 'tomas ', 'arango', 27, 7568941, 'medellin', '3,4,10,8,6'),
(8, 'luisa', 'restrepo', 29, 3659123, 'bello', '9,5,6,7,10'),
(9, 'felipe', 'zuluaga', 30, 4567763, 'caldas', '5,8'),
(10, 'maunela', 'gomez', 29, 1597534, 'sabaneta', '7,8');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `personas`
--
ALTER TABLE `personas`
  ADD PRIMARY KEY (`persona_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `personas`
--
ALTER TABLE `personas`
  MODIFY `persona_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
