DROP TABLE IF EXISTS `url_permissao_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `url_permissao_roles` (
                                       `permissao_id` bigint NOT NULL,
                                       `role_id` bigint NOT NULL,
                                       KEY `FKbbypacvxvbbte1lwr6kqgkl61` (`role_id`),
                                       KEY `FKndvp6i2odtrjuwb68cr5yp65n` (`permissao_id`),
                                       CONSTRAINT `FKbbypacvxvbbte1lwr6kqgkl61` FOREIGN KEY (`role_id`) REFERENCES `role_model` (`roleid`),
                                       CONSTRAINT `FKndvp6i2odtrjuwb68cr5yp65n` FOREIGN KEY (`permissao_id`) REFERENCES `url_permissao` (`permissao_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `url_permissao_roles`
--

LOCK TABLES `url_permissao_roles` WRITE;
/*!40000 ALTER TABLE `url_permissao_roles` DISABLE KEYS */;
INSERT INTO `url_permissao_roles` VALUES (1,1);
/*!40000 ALTER TABLE `url_permissao_roles` ENABLE KEYS */;
UNLOCK TABLES;