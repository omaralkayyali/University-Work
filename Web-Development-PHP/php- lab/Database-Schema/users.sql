-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: May 08, 2012 at 09:15 PM
-- Server version: 5.5.16
-- PHP Version: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `sitename`
--

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `user_id` mediumint(8) unsigned NOT NULL AUTO_INCREMENT,
  `first_name` varchar(15) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `email` varchar(40) NOT NULL,
  `password` char(40) NOT NULL,
  `registration_date` datetime NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=27 ;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `first_name`, `last_name`, `email`, `password`, `registration_date`) VALUES
(1, 'Larry', 'Ullman', 'phpmysql2@DMCInsights.com', '5baa61e4c9b93f3f0682250b6cf8331b7ee68fd8', '2012-05-08 22:14:30'),
(2, 'Larry', 'Ullman', 'phpmysql2@DMCInsights.com', '5baa61e4c9b93f3f0682250b6cf8331b7ee68fd8', '2012-05-08 22:14:30'),
(3, 'John', 'Lennon', 'john@beatles.com', '2a50435b0f512f60988db719106a258fb7e338ff', '2012-05-08 22:14:30'),
(4, 'Paul', 'McCartney', 'paul@beatles.com', '6ae16792c502a5b47da180ce8456e5ae7d65e262', '2012-05-08 22:14:30'),
(5, 'George', 'Harrison', 'george@beatles.com ', '1af17e73721dbe0c40011b82ed4bb1a7dbe3ce29', '2012-05-08 22:14:30'),
(6, 'Ringo', 'Starr', 'ringo@beatles.com', '520f73691bcf89d508d923a2dbc8e6fa58efb522', '2012-05-08 22:14:30'),
(7, 'David', 'Jones', 'davey@monkees.com', 'ec23244e40137ef72763267f17ed6c7ebb2b019f', '2012-05-08 22:14:30'),
(8, 'Peter', 'Tork', 'peter@monkees.com', 'b8f6bc0c646f68ec6f27653f8473ae4ae81fd302', '2012-05-08 22:14:30'),
(9, 'Micky', 'Dolenz', 'micky@monkees.com ', '0599b6e3c9206ef135c83a921294ba6417dbc673', '2012-05-08 22:14:30'),
(10, 'Mike', 'Nesmith', 'mike@monkees.com', '804a1773e9985abeb1f2605e0cc22211cc58cb1b', '2012-05-08 22:14:30'),
(11, 'David', 'Sedaris', 'david@authors.com', 'f54e748ae9624210402eeb2c15a9f506a110ef72', '2012-05-08 22:14:30'),
(12, 'Nick', 'Hornby', 'nick@authors.com', '815f12d7b9d7cd690d4781015c2a0a5b3ae207c0', '2012-05-08 22:14:30'),
(13, 'Melissa', 'Bank', 'melissa@authors.com', '15ac6793642add347cbf24b8884b97947f637091', '2012-05-08 22:14:30'),
(14, 'Toni', 'Morrison', 'toni@authors.com', 'ce3a79105879624f762c01ecb8abee7b31e67df5', '2012-05-08 22:14:30'),
(15, 'Jonathan', 'Franzen', 'jonathan@authors.com', 'c969581a0a7d6f790f4b520225f34fd90a09c86f', '2012-05-08 22:14:30'),
(16, 'Don', 'DeLillo', 'don@authors.com', '01a3ff9a11b328afd3e5affcba4cc9e539c4c455', '2012-05-08 22:14:30'),
(17, 'Graham', 'Greene', 'graham@authors.com', '7c16ec1fcbc8c3ec99790f25c310ef63febb1bb3', '2012-05-08 22:14:30'),
(18, 'Michael', 'Chabon', 'michael@authors.com', 'bd58cc413f97c33930778416a6dbd2d67720dc41', '2012-05-08 22:14:30'),
(19, 'Richard', 'Brautigan', 'richard@authors.com', 'b1f8414005c218fb53b661f17b4f671bccecea3d', '2012-05-08 22:14:30'),
(20, 'Russell', 'Banks', 'russell@authors.com', '6bc4056557e33f1e209870ab578ed362f8b3c1b8', '2012-05-08 22:14:30'),
(21, 'Homer', 'Simpson', 'homer@simpson.com', '54a0b2dcbc5a944907d29304405f0552344b3847', '2012-05-08 22:14:30'),
(22, 'Marge', 'Simpson', 'marge@simpson.com', 'cea9be7b57e183dea0e4cf000489fe073908c0ca', '2012-05-08 22:14:30'),
(23, 'Bart', 'Simpson', 'bart@simpson.com', '73265774abd1028ed8ef06afc5fa0f9a7ccbb6aa', '2012-05-08 22:14:30'),
(24, 'Lisa', 'Simpson', 'lisa@simpson.com', 'a09bb16971ec0759dfff75c088f004e205c9e27b', '2012-05-08 22:14:30'),
(25, 'Maggie', 'Simpson', 'maggie@simpson.com', '0e87350b393ceced1d4751b828d18102be123edb', '2012-05-08 22:14:30'),
(26, 'Abe', 'Simpson', 'abe@simpson.com', '6591827c8e3d4624e8fc1ee324f31fa389fdafb4', '2012-05-08 22:14:30');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
