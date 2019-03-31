CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `name` varchar(64) NOT NULL,
  `unit_price` double NOT NULL,
  `quantity` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
INSERT INTO `product` (`id`, `name`, `unit_price`, `quantity`) VALUES
(1, 'Phone', 300, 50),
(2, 'Tablet', 250, 20),
(3, 'Mouse', 20, 30),
(4, 'Keyboard', 20, 30),
(5, 'Speaker', 40, 30),
(6, 'Screen', 300, 40);