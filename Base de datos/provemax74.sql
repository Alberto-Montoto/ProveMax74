-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-10-2023 a las 23:53:07
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
  `idDetalle` int(11) NOT NULL,
  `idProveedor` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detallecompra`
--

CREATE TABLE `detallecompra` (
  `idDetalle` int(11) NOT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `precioCosto` double DEFAULT NULL,
  `nombreProducto` varchar(50) DEFAULT NULL,
  `idProducto` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `detallecompra`
--

INSERT INTO `detallecompra` (`idDetalle`, `cantidad`, `precioCosto`, `nombreProducto`, `idProducto`) VALUES
(2, 4, 500000, 'fideos', 222),
(5, 2, 1000000, 'fideos', 222),
(6, 2, 1000000, 'azucar', 333),
(7, 2, 290, 'azucar', 333),
(8, 2, 290, 'q41wvr', 333),
(9, 2, 290, 'q41wvr', 111),
(12, 3, 1500, 'fideos', 222),
(13, 3, 1500, 'fideos', 222),
(15, 3, 1500, 'azucar', 333),
(16, 3, 1500, 'arroz', 111),
(17, 4, 400, 'Te', 1),
(18, 32, 3200, 'Te', 1),
(19, 56, 5600, 'Te', 1),
(20, 56, 5600, 'Te', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `idProducto` int(11) NOT NULL,
  `nombreProducto` varchar(50) DEFAULT NULL,
  `descripcion` varchar(50) NOT NULL,
  `precioActual` double DEFAULT NULL,
  `stock` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`idProducto`, `nombreProducto`, `descripcion`, `precioActual`, `stock`, `estado`) VALUES
(1, 'Te', 'Verde', 100, 200, 1),
(111, 'arroz', 'fino', 500, 150, 1),
(222, 'fideos', 'tirabuzon', 200, 100, 1),
(333, 'azucar', 'morena', 123, 50, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `idProveedor` int(11) NOT NULL,
  `nombreCompleto` varchar(50) NOT NULL,
  `razonSocial` varchar(50) NOT NULL,
  `domicilio` varchar(50) NOT NULL,
  `telefono` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`idProveedor`, `nombreCompleto`, `razonSocial`, `domicilio`, `telefono`) VALUES
(7, 'Polanski', 'Ventas Electros', 'Caseros 123', '011888555'),
(8, 'Conti', 'Todo Electro', 'San Martin 4567', '011777666'),
(9, 'Sarmiento', 'Electro Max', 'Belgrano 4567', '011222333'),
(10, 'Paez', 'Electrodomesticos Power', 'Belgrano 4567', '011222333');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `compra`
--
ALTER TABLE `compra`
  ADD PRIMARY KEY (`idCompra`),
  ADD KEY `idDetalle` (`idDetalle`),
  ADD KEY `idProveedor` (`idProveedor`);

--
-- Indices de la tabla `detallecompra`
--
ALTER TABLE `detallecompra`
  ADD PRIMARY KEY (`idDetalle`),
  ADD KEY `idProducto` (`idProducto`);

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
  MODIFY `idCompra` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `detallecompra`
--
ALTER TABLE `detallecompra`
  MODIFY `idDetalle` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `idProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=334;

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
  ADD CONSTRAINT `compra_ibfk_1` FOREIGN KEY (`idDetalle`) REFERENCES `detallecompra` (`idDetalle`),
  ADD CONSTRAINT `compra_ibfk_2` FOREIGN KEY (`idProveedor`) REFERENCES `proveedor` (`idProveedor`);

--
-- Filtros para la tabla `detallecompra`
--
ALTER TABLE `detallecompra`
  ADD CONSTRAINT `detallecompra_ibfk_1` FOREIGN KEY (`idProducto`) REFERENCES `producto` (`idProducto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
