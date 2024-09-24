--
-- PostgreSQL database dump
--

-- Dumped from database version 16.2
-- Dumped by pg_dump version 16.2

-- Started on 2024-05-10 19:34:31

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 215 (class 1259 OID 17165)
-- Name: customers; Type: TABLE; Schema: public; Owner: developer
--

CREATE TABLE public.customers (
    id integer NOT NULL,
    name character varying NOT NULL,
    phone integer
);


ALTER TABLE public.customers OWNER TO developer;

--
-- TOC entry 216 (class 1259 OID 17170)
-- Name: meal_dishes; Type: TABLE; Schema: public; Owner: developer
--

CREATE TABLE public.meal_dishes (
    meal_id integer NOT NULL,
    item_id integer NOT NULL,
    quantity integer NOT NULL
);


ALTER TABLE public.meal_dishes OWNER TO developer;

--
-- TOC entry 217 (class 1259 OID 17173)
-- Name: meals; Type: TABLE; Schema: public; Owner: developer
--

CREATE TABLE public.meals (
    id integer NOT NULL,
    date_of_meal date NOT NULL,
    cost_of_meal double precision NOT NULL,
    customers_id integer NOT NULL,
    staff_id integer NOT NULL
);


ALTER TABLE public.meals OWNER TO developer;

--
-- TOC entry 218 (class 1259 OID 17176)
-- Name: meals_id_seq; Type: SEQUENCE; Schema: public; Owner: developer
--

CREATE SEQUENCE public.meals_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.meals_id_seq OWNER TO developer;

--
-- TOC entry 4902 (class 0 OID 0)
-- Dependencies: 218
-- Name: meals_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: developer
--

ALTER SEQUENCE public.meals_id_seq OWNED BY public.meals.id;


--
-- TOC entry 219 (class 1259 OID 17177)
-- Name: menu; Type: TABLE; Schema: public; Owner: developer
--

CREATE TABLE public.menu (
    id integer NOT NULL,
    name character varying NOT NULL,
    available_date_from date,
    available_date_to date,
    type character varying NOT NULL,
    season character varying
);


ALTER TABLE public.menu OWNER TO developer;

--
-- TOC entry 220 (class 1259 OID 17182)
-- Name: menu_items; Type: TABLE; Schema: public; Owner: developer
--

CREATE TABLE public.menu_items (
    id integer NOT NULL,
    menu_id integer NOT NULL,
    price double precision NOT NULL,
    name character varying NOT NULL,
    description character varying
);


ALTER TABLE public.menu_items OWNER TO developer;

--
-- TOC entry 221 (class 1259 OID 17187)
-- Name: reff_staff_roles; Type: TABLE; Schema: public; Owner: developer
--

CREATE TABLE public.reff_staff_roles (
    code integer NOT NULL,
    role_name character varying NOT NULL,
    role_description character varying NOT NULL
);


ALTER TABLE public.reff_staff_roles OWNER TO developer;

--
-- TOC entry 222 (class 1259 OID 17192)
-- Name: sales; Type: TABLE; Schema: public; Owner: developer
--

CREATE TABLE public.sales (
    id integer NOT NULL,
    amount double precision NOT NULL,
    id_meals integer NOT NULL,
    id_staff integer NOT NULL,
    id_customer integer NOT NULL,
    date_of_meal date NOT NULL
);


ALTER TABLE public.sales OWNER TO developer;

--
-- TOC entry 223 (class 1259 OID 17195)
-- Name: sales_id_seq; Type: SEQUENCE; Schema: public; Owner: developer
--

CREATE SEQUENCE public.sales_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.sales_id_seq OWNER TO developer;

--
-- TOC entry 4903 (class 0 OID 0)
-- Dependencies: 223
-- Name: sales_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: developer
--

ALTER SEQUENCE public.sales_id_seq OWNED BY public.sales.id;


--
-- TOC entry 224 (class 1259 OID 17196)
-- Name: staff; Type: TABLE; Schema: public; Owner: developer
--

CREATE TABLE public.staff (
    id integer NOT NULL,
    first_name character varying NOT NULL,
    last_name character varying NOT NULL,
    role_code integer NOT NULL
);


ALTER TABLE public.staff OWNER TO developer;

--
-- TOC entry 4717 (class 2604 OID 17201)
-- Name: meals id; Type: DEFAULT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.meals ALTER COLUMN id SET DEFAULT nextval('public.meals_id_seq'::regclass);


--
-- TOC entry 4718 (class 2604 OID 17202)
-- Name: sales id; Type: DEFAULT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.sales ALTER COLUMN id SET DEFAULT nextval('public.sales_id_seq'::regclass);


--
-- TOC entry 4887 (class 0 OID 17165)
-- Dependencies: 215
-- Data for Name: customers; Type: TABLE DATA; Schema: public; Owner: developer
--

INSERT INTO public.customers (id, name, phone) VALUES (1, 'Tona', 664123451);
INSERT INTO public.customers (id, name, phone) VALUES (2, 'Brayden', 564898785);
INSERT INTO public.customers (id, name, phone) VALUES (3, 'Yaritza Fuentes', 657984319);
INSERT INTO public.customers (id, name, phone) VALUES (4, 'Jose Jose', 124652156);
INSERT INTO public.customers (id, name, phone) VALUES (5, 'Kevin', 662451156);


--
-- TOC entry 4888 (class 0 OID 17170)
-- Dependencies: 216
-- Data for Name: meal_dishes; Type: TABLE DATA; Schema: public; Owner: developer
--

INSERT INTO public.meal_dishes (meal_id, item_id, quantity) VALUES (1, 1, 50);
INSERT INTO public.meal_dishes (meal_id, item_id, quantity) VALUES (2, 2, 60);


--
-- TOC entry 4889 (class 0 OID 17173)
-- Dependencies: 217
-- Data for Name: meals; Type: TABLE DATA; Schema: public; Owner: developer
--

INSERT INTO public.meals (id, date_of_meal, cost_of_meal, customers_id, staff_id) VALUES (1, '2024-05-07', 12, 1, 4);
INSERT INTO public.meals (id, date_of_meal, cost_of_meal, customers_id, staff_id) VALUES (8, '2024-05-10', 65, 2, 4);
INSERT INTO public.meals (id, date_of_meal, cost_of_meal, customers_id, staff_id) VALUES (10, '2024-05-10', 25.99, 3, 5);


--
-- TOC entry 4891 (class 0 OID 17177)
-- Dependencies: 219
-- Data for Name: menu; Type: TABLE DATA; Schema: public; Owner: developer
--

INSERT INTO public.menu (id, name, available_date_from, available_date_to, type, season) VALUES (2, 'Menu Especial', '2024-08-01', '2025-05-08', 'Comida', 'Especial');
INSERT INTO public.menu (id, name, available_date_from, available_date_to, type, season) VALUES (1, 'Menu De la casa', '2024-05-08', '2024-07-30', 'Entrada', 'Verano');


--
-- TOC entry 4892 (class 0 OID 17182)
-- Dependencies: 220
-- Data for Name: menu_items; Type: TABLE DATA; Schema: public; Owner: developer
--

INSERT INTO public.menu_items (id, menu_id, price, name, description) VALUES (1, 1, 25, 'Pastel', 'Un postre especial de la casa');
INSERT INTO public.menu_items (id, menu_id, price, name, description) VALUES (2, 1, 69, 'Pasta Especial', 'Pasta a lo especial!!');


--
-- TOC entry 4893 (class 0 OID 17187)
-- Dependencies: 221
-- Data for Name: reff_staff_roles; Type: TABLE DATA; Schema: public; Owner: developer
--

INSERT INTO public.reff_staff_roles (code, role_name, role_description) VALUES (1, 'Cocinero', 'Cocina');
INSERT INTO public.reff_staff_roles (code, role_name, role_description) VALUES (2, 'Mesero', 'Asiste a los clientes');
INSERT INTO public.reff_staff_roles (code, role_name, role_description) VALUES (3, 'Intendente', 'Ayuda con la limpieza');
INSERT INTO public.reff_staff_roles (code, role_name, role_description) VALUES (4, 'Caja', 'Encargado de realizar cobros al cliente');


--
-- TOC entry 4894 (class 0 OID 17192)
-- Dependencies: 222
-- Data for Name: sales; Type: TABLE DATA; Schema: public; Owner: developer
--

INSERT INTO public.sales (id, amount, id_meals, id_staff, id_customer, date_of_meal) VALUES (2, 42, 5, 1, 1, '2024-05-08');
INSERT INTO public.sales (id, amount, id_meals, id_staff, id_customer, date_of_meal) VALUES (4, 69.69, 7, 1, 2, '2024-05-08');
INSERT INTO public.sales (id, amount, id_meals, id_staff, id_customer, date_of_meal) VALUES (5, 13, 2, 1, 1, '2024-05-07');
INSERT INTO public.sales (id, amount, id_meals, id_staff, id_customer, date_of_meal) VALUES (6, 15.65, 9, 2, 1, '2024-05-10');
INSERT INTO public.sales (id, amount, id_meals, id_staff, id_customer, date_of_meal) VALUES (7, 17.99, 11, 2, 2, '2024-05-10');


--
-- TOC entry 4896 (class 0 OID 17196)
-- Dependencies: 224
-- Data for Name: staff; Type: TABLE DATA; Schema: public; Owner: developer
--

INSERT INTO public.staff (id, first_name, last_name, role_code) VALUES (1, 'Juan', 'Soto', 4);
INSERT INTO public.staff (id, first_name, last_name, role_code) VALUES (2, 'Pablo', 'Montes', 4);
INSERT INTO public.staff (id, first_name, last_name, role_code) VALUES (3, 'Ana', 'Perez', 3);
INSERT INTO public.staff (id, first_name, last_name, role_code) VALUES (4, 'Daian', 'Felix', 2);
INSERT INTO public.staff (id, first_name, last_name, role_code) VALUES (5, 'Elliot', 'Seaman', 1);


--
-- TOC entry 4904 (class 0 OID 0)
-- Dependencies: 218
-- Name: meals_id_seq; Type: SEQUENCE SET; Schema: public; Owner: developer
--

SELECT pg_catalog.setval('public.meals_id_seq', 11, true);


--
-- TOC entry 4905 (class 0 OID 0)
-- Dependencies: 223
-- Name: sales_id_seq; Type: SEQUENCE SET; Schema: public; Owner: developer
--

SELECT pg_catalog.setval('public.sales_id_seq', 7, true);


--
-- TOC entry 4724 (class 2606 OID 17204)
-- Name: customers Customers_pkey; Type: CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.customers
    ADD CONSTRAINT "Customers_pkey" PRIMARY KEY (id);


--
-- TOC entry 4726 (class 2606 OID 17206)
-- Name: meals Meals_pkey; Type: CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.meals
    ADD CONSTRAINT "Meals_pkey" PRIMARY KEY (id);


--
-- TOC entry 4728 (class 2606 OID 17208)
-- Name: menu Menú _pkey; Type: CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.menu
    ADD CONSTRAINT "Menú _pkey" PRIMARY KEY (id);


--
-- TOC entry 4730 (class 2606 OID 17210)
-- Name: menu_items Menú_Items_pkey; Type: CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.menu_items
    ADD CONSTRAINT "Menú_Items_pkey" PRIMARY KEY (id);


--
-- TOC entry 4732 (class 2606 OID 17212)
-- Name: reff_staff_roles Reff_Staff_Roles_pkey; Type: CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.reff_staff_roles
    ADD CONSTRAINT "Reff_Staff_Roles_pkey" PRIMARY KEY (code);


--
-- TOC entry 4736 (class 2606 OID 17214)
-- Name: staff Staff_pkey; Type: CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.staff
    ADD CONSTRAINT "Staff_pkey" PRIMARY KEY (id);


--
-- TOC entry 4720 (class 2606 OID 17215)
-- Name: menu check_Available_Date_To ; Type: CHECK CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE public.menu
    ADD CONSTRAINT "check_Available_Date_To " CHECK (((available_date_to > CURRENT_DATE) AND (available_date_to > CURRENT_DATE))) NOT VALID;


--
-- TOC entry 4721 (class 2606 OID 17216)
-- Name: staff check_first_name; Type: CHECK CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE public.staff
    ADD CONSTRAINT check_first_name CHECK (((first_name)::text ~ '^[^0-9]+$'::text)) NOT VALID;


--
-- TOC entry 4722 (class 2606 OID 17217)
-- Name: staff check_last_name; Type: CHECK CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE public.staff
    ADD CONSTRAINT check_last_name CHECK (((last_name)::text ~ '^[^0-9]+$'::text)) NOT VALID;


--
-- TOC entry 4719 (class 2606 OID 17218)
-- Name: customers name; Type: CHECK CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE public.customers
    ADD CONSTRAINT name CHECK (((name)::text ~ '^[^0-9]+$'::text)) NOT VALID;


--
-- TOC entry 4734 (class 2606 OID 17220)
-- Name: sales sale_pkey; Type: CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.sales
    ADD CONSTRAINT sale_pkey PRIMARY KEY (id);


--
-- TOC entry 4738 (class 2606 OID 17221)
-- Name: meals customer_id; Type: FK CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.meals
    ADD CONSTRAINT customer_id FOREIGN KEY (customers_id) REFERENCES public.customers(id);


--
-- TOC entry 4741 (class 2606 OID 17226)
-- Name: sales id_Customer; Type: FK CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.sales
    ADD CONSTRAINT "id_Customer" FOREIGN KEY (id_customer) REFERENCES public.customers(id);


--
-- TOC entry 4742 (class 2606 OID 17231)
-- Name: sales id_Staff; Type: FK CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.sales
    ADD CONSTRAINT "id_Staff" FOREIGN KEY (id_staff) REFERENCES public.staff(id);


--
-- TOC entry 4737 (class 2606 OID 17236)
-- Name: meal_dishes item_id; Type: FK CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.meal_dishes
    ADD CONSTRAINT item_id FOREIGN KEY (item_id) REFERENCES public.menu_items(id);


--
-- TOC entry 4740 (class 2606 OID 17241)
-- Name: menu_items menu_id; Type: FK CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.menu_items
    ADD CONSTRAINT menu_id FOREIGN KEY (menu_id) REFERENCES public.menu(id);


--
-- TOC entry 4743 (class 2606 OID 17246)
-- Name: staff role_code; Type: FK CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.staff
    ADD CONSTRAINT role_code FOREIGN KEY (role_code) REFERENCES public.reff_staff_roles(code);


--
-- TOC entry 4739 (class 2606 OID 17251)
-- Name: meals staff_id; Type: FK CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.meals
    ADD CONSTRAINT staff_id FOREIGN KEY (staff_id) REFERENCES public.staff(id);


-- Completed on 2024-05-10 19:34:32

--
-- PostgreSQL database dump complete
--

