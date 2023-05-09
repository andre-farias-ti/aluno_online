DROP TABLE IF EXISTS `url_permissao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `url_permissao` (
                                 `permissao_id` bigint NOT NULL,
                                 `url` varchar(255) NOT NULL,
                                 PRIMARY KEY (`permissao_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `url_permissao`
--

LOCK TABLES `url_permissao` WRITE;
/*!40000 ALTER TABLE `url_permissao` DISABLE KEYS */;
INSERT INTO `url_permissao` VALUES (1,'/alunos/**');
/*!40000 ALTER TABLE `url_permissao` ENABLE KEYS */;
UNLOCK TABLES;