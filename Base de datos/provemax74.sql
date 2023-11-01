-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-11-2023 a las 22:21:52
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `provemax74`
--
CREATE DATABASE IF NOT EXISTS `provemax74` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `provemax74`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra`
--

CREATE TABLE `compra` (
  `idCompra` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `idProveedor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `compra`
--

INSERT INTO `compra` (`idCompra`, `fecha`, `idProveedor`) VALUES
(1, '2023-10-18', 5),
(2, '2023-10-18', 6),
(3, '2023-10-17', 7),
(4, '2023-10-16', 8),
(5, '2023-10-15', 5),
(6, '2023-11-01', 8);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallecompra`
--

CREATE TABLE `detallecompra` (
  `idDetalle` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precioCosto` double NOT NULL,
  `idProducto` int(11) NOT NULL,
  `idCompra` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `detallecompra`
--

INSERT INTO `detallecompra` (`idDetalle`, `cantidad`, `precioCosto`, `idProducto`, `idCompra`) VALUES
(1, 10, 2000, 334, 1),
(2, 10, 3000, 338, 2),
(504, 10, 3000, 340, 5),
(506, 20, 2000, 342, 2),
(507, 30, 9000, 338, 3),
(508, 15, 3000, 341, 4),
(509, 25, 7500, 335, 6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `nombreProducto` varchar(50) NOT NULL,
  `descripcion` varchar(50) NOT NULL,
  `precioActual` double NOT NULL,
  `stock` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `nombreProducto`, `descripcion`, `precioActual`, `stock`, `estado`) VALUES
(334, 'Lavarropas', 'Drean', 200, 50, 1),
(335, 'Lavarropas', 'Whirpool', 300, 50, 1),
(336, 'Lavavajillas', 'Samsung', 500, 50, 1),
(337, 'Lavavajillas', 'LG', 400, 50, 1),
(338, 'Heladera', 'Conqueror', 300, 50, 1),
(339, 'Heladera', 'Gafa', 400, 50, 1),
(340, 'Cocina', 'Domec', 300, 50, 1),
(341, 'Cocina', 'Florencia', 200, 50, 1),
(342, 'Microondas', 'Philips', 100, 50, 1),
(343, 'Microondas', 'Atma', 150, 50, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `idProveedor` int(11) NOT NULL,
  `razonSocial` varchar(50) NOT NULL,
  `domicilio` varchar(50) NOT NULL,
  `telefono` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`idProveedor`, `razonSocial`, `domicilio`, `telefono`) VALUES
(5, 'Musimundo', 'Carabobo 789', '011123456'),
(6, 'Red Electro', 'Florida 1415', '011181920'),
(7, 'Ventas Electros', 'Caseros 123', '011888555'),
(8, 'Todo Electro', 'San Martin 4567', '011777666'),
(9, 'Electro Max', 'Rivadavia 4567', '011212223'),
(10, 'Electrodomesticos Power', 'Belgrano 4567', '011222333');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`idCompra`),
  ADD KEY `idProveedor` (`idProveedor`);

--
-- Indices de la tabla `detallecompra`
--
ALTER TABLE `detallecompra`
  ADD PRIMARY KEY (`idDetalle`),
  ADD KEY `idProducto` (`idProducto`),
  ADD KEY `idCompra` (`idCompra`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`idProducto`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`idProveedor`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `compra`
--
ALTER TABLE `compra`
  MODIFY `idCompra` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `detallecompra`
--
ALTER TABLE `detallecompra`
  MODIFY `idDetalle` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=510;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=344;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `idProveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `compra`
--
ALTER TABLE `compra`
  ADD CONSTRAINT `compra_ibfk_2` FOREIGN KEY (`idProveedor`) REFERENCES `proveedor` (`idProveedor`);

--
-- Filtros para la tabla `detallecompra`
--
ALTER TABLE `detallecompra`
  ADD CONSTRAINT `detallecompra_ibfk_1` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`),
  ADD CONSTRAINT `detallecompra_ibfk_2` FOREIGN KEY (`idCompra`) REFERENCES `compra` (`idCompra`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
