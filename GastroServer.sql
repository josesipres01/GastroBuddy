--
-- PostgreSQL database dump
--

-- Dumped from database version 16.4
-- Dumped by pg_dump version 16.4

-- Started on 2024-10-07 20:19:10

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

--
-- TOC entry 4 (class 2615 OID 2200)
-- Name: public; Type: SCHEMA; Schema: -; Owner: pg_database_owner
--

CREATE SCHEMA public;


ALTER SCHEMA public OWNER TO pg_database_owner;

--
-- TOC entry 4868 (class 0 OID 0)
-- Dependencies: 4
-- Name: SCHEMA public; Type: COMMENT; Schema: -; Owner: pg_database_owner
--

COMMENT ON SCHEMA public IS 'standard public schema';


SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 216 (class 1259 OID 26693)
-- Name: customers; Type: TABLE; Schema: public; Owner: developer
--

CREATE TABLE public.customers (
    id integer NOT NULL,
    name character varying NOT NULL,
    phone integer
);


ALTER TABLE public.customers OWNER TO developer;

--
-- TOC entry 215 (class 1259 OID 26692)
-- Name: customers_id_seq; Type: SEQUENCE; Schema: public; Owner: developer
--

CREATE SEQUENCE public.customers_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.customers_id_seq OWNER TO developer;

--
-- TOC entry 4869 (class 0 OID 0)
-- Dependencies: 215
-- Name: customers_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: developer
--

ALTER SEQUENCE public.customers_id_seq OWNED BY public.customers.id;


--
-- TOC entry 218 (class 1259 OID 26700)
-- Name: meal_dishes; Type: TABLE; Schema: public; Owner: developer
--

CREATE TABLE public.meal_dishes (
    meal_id integer NOT NULL,
    item_id integer NOT NULL,
    quantity integer NOT NULL
);


ALTER TABLE public.meal_dishes OWNER TO developer;

--
-- TOC entry 217 (class 1259 OID 26699)
-- Name: meal_dishes_meal_id_seq; Type: SEQUENCE; Schema: public; Owner: developer
--

CREATE SEQUENCE public.meal_dishes_meal_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.meal_dishes_meal_id_seq OWNER TO developer;

--
-- TOC entry 4870 (class 0 OID 0)
-- Dependencies: 217
-- Name: meal_dishes_meal_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: developer
--

ALTER SEQUENCE public.meal_dishes_meal_id_seq OWNED BY public.meal_dishes.meal_id;


--
-- TOC entry 220 (class 1259 OID 26707)
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
-- TOC entry 219 (class 1259 OID 26706)
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
-- TOC entry 4871 (class 0 OID 0)
-- Dependencies: 219
-- Name: meals_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: developer
--

ALTER SEQUENCE public.meals_id_seq OWNED BY public.meals.id;


--
-- TOC entry 222 (class 1259 OID 26712)
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
-- TOC entry 221 (class 1259 OID 26711)
-- Name: menu_id_seq; Type: SEQUENCE; Schema: public; Owner: developer
--

CREATE SEQUENCE public.menu_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.menu_id_seq OWNER TO developer;

--
-- TOC entry 4872 (class 0 OID 0)
-- Dependencies: 221
-- Name: menu_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: developer
--

ALTER SEQUENCE public.menu_id_seq OWNED BY public.menu.id;


--
-- TOC entry 224 (class 1259 OID 26719)
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
-- TOC entry 223 (class 1259 OID 26718)
-- Name: menu_items_id_seq; Type: SEQUENCE; Schema: public; Owner: developer
--

CREATE SEQUENCE public.menu_items_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.menu_items_id_seq OWNER TO developer;

--
-- TOC entry 4873 (class 0 OID 0)
-- Dependencies: 223
-- Name: menu_items_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: developer
--

ALTER SEQUENCE public.menu_items_id_seq OWNED BY public.menu_items.id;


--
-- TOC entry 226 (class 1259 OID 26726)
-- Name: reff_staff_roles; Type: TABLE; Schema: public; Owner: developer
--

CREATE TABLE public.reff_staff_roles (
    code integer NOT NULL,
    role_name character varying NOT NULL,
    role_description character varying NOT NULL
);


ALTER TABLE public.reff_staff_roles OWNER TO developer;

--
-- TOC entry 225 (class 1259 OID 26725)
-- Name: reff_staff_roles_code_seq; Type: SEQUENCE; Schema: public; Owner: developer
--

CREATE SEQUENCE public.reff_staff_roles_code_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.reff_staff_roles_code_seq OWNER TO developer;

--
-- TOC entry 4874 (class 0 OID 0)
-- Dependencies: 225
-- Name: reff_staff_roles_code_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: developer
--

ALTER SEQUENCE public.reff_staff_roles_code_seq OWNED BY public.reff_staff_roles.code;


--
-- TOC entry 228 (class 1259 OID 26733)
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
-- TOC entry 227 (class 1259 OID 26732)
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
-- TOC entry 4875 (class 0 OID 0)
-- Dependencies: 227
-- Name: sales_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: developer
--

ALTER SEQUENCE public.sales_id_seq OWNED BY public.sales.id;


--
-- TOC entry 230 (class 1259 OID 26738)
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
-- TOC entry 229 (class 1259 OID 26737)
-- Name: staff_id_seq; Type: SEQUENCE; Schema: public; Owner: developer
--

CREATE SEQUENCE public.staff_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER SEQUENCE public.staff_id_seq OWNER TO developer;

--
-- TOC entry 4876 (class 0 OID 0)
-- Dependencies: 229
-- Name: staff_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: developer
--

ALTER SEQUENCE public.staff_id_seq OWNED BY public.staff.id;


--
-- TOC entry 4669 (class 2604 OID 26696)
-- Name: customers id; Type: DEFAULT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.customers ALTER COLUMN id SET DEFAULT nextval('public.customers_id_seq'::regclass);


--
-- TOC entry 4670 (class 2604 OID 26703)
-- Name: meal_dishes meal_id; Type: DEFAULT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.meal_dishes ALTER COLUMN meal_id SET DEFAULT nextval('public.meal_dishes_meal_id_seq'::regclass);


--
-- TOC entry 4671 (class 2604 OID 26744)
-- Name: meals id; Type: DEFAULT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.meals ALTER COLUMN id SET DEFAULT nextval('public.meals_id_seq'::regclass);


--
-- TOC entry 4672 (class 2604 OID 26715)
-- Name: menu id; Type: DEFAULT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.menu ALTER COLUMN id SET DEFAULT nextval('public.menu_id_seq'::regclass);


--
-- TOC entry 4673 (class 2604 OID 26722)
-- Name: menu_items id; Type: DEFAULT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.menu_items ALTER COLUMN id SET DEFAULT nextval('public.menu_items_id_seq'::regclass);


--
-- TOC entry 4674 (class 2604 OID 26729)
-- Name: reff_staff_roles code; Type: DEFAULT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.reff_staff_roles ALTER COLUMN code SET DEFAULT nextval('public.reff_staff_roles_code_seq'::regclass);


--
-- TOC entry 4675 (class 2604 OID 26745)
-- Name: sales id; Type: DEFAULT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.sales ALTER COLUMN id SET DEFAULT nextval('public.sales_id_seq'::regclass);


--
-- TOC entry 4676 (class 2604 OID 26741)
-- Name: staff id; Type: DEFAULT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.staff ALTER COLUMN id SET DEFAULT nextval('public.staff_id_seq'::regclass);


--
-- TOC entry 4848 (class 0 OID 26693)
-- Dependencies: 216
-- Data for Name: customers; Type: TABLE DATA; Schema: public; Owner: developer
--

INSERT INTO public.customers VALUES (1, 'Juan', 12221221);
INSERT INTO public.customers VALUES (2, 'Tona Scoot', 6622112);
INSERT INTO public.customers VALUES (5, 'Juan', 551621);
INSERT INTO public.customers VALUES (4, 'Saul', 32424233);
INSERT INTO public.customers VALUES (8, 'Sote', 6121233);
INSERT INTO public.customers VALUES (12, 'Juan', 212414124);


--
-- TOC entry 4850 (class 0 OID 26700)
-- Dependencies: 218
-- Data for Name: meal_dishes; Type: TABLE DATA; Schema: public; Owner: developer
--

INSERT INTO public.meal_dishes VALUES (1, 2, 12);


--
-- TOC entry 4852 (class 0 OID 26707)
-- Dependencies: 220
-- Data for Name: meals; Type: TABLE DATA; Schema: public; Owner: developer
--



--
-- TOC entry 4854 (class 0 OID 26712)
-- Dependencies: 222
-- Data for Name: menu; Type: TABLE DATA; Schema: public; Owner: developer
--

INSERT INTO public.menu VALUES (1, 'Menu Casa', '2024-10-12', '2024-10-22', 'Entrada', 'Otoño');


--
-- TOC entry 4856 (class 0 OID 26719)
-- Dependencies: 224
-- Data for Name: menu_items; Type: TABLE DATA; Schema: public; Owner: developer
--

INSERT INTO public.menu_items VALUES (2, 1, 20, 'CocaCola', 'Beber');


--
-- TOC entry 4858 (class 0 OID 26726)
-- Dependencies: 226
-- Data for Name: reff_staff_roles; Type: TABLE DATA; Schema: public; Owner: developer
--

INSERT INTO public.reff_staff_roles VALUES (1, 'Caja', 'Cobra');
INSERT INTO public.reff_staff_roles VALUES (2, 'Mesero', 'Meserea');


--
-- TOC entry 4860 (class 0 OID 26733)
-- Dependencies: 228
-- Data for Name: sales; Type: TABLE DATA; Schema: public; Owner: developer
--

INSERT INTO public.sales VALUES (9, 12, 1, 1, 1, '2024-10-06');
INSERT INTO public.sales VALUES (10, 23, 12, 1, 1, '2024-10-07');


--
-- TOC entry 4862 (class 0 OID 26738)
-- Dependencies: 230
-- Data for Name: staff; Type: TABLE DATA; Schema: public; Owner: developer
--

INSERT INTO public.staff VALUES (1, 'Juan', 'Soto', 2);


--
-- TOC entry 4877 (class 0 OID 0)
-- Dependencies: 215
-- Name: customers_id_seq; Type: SEQUENCE SET; Schema: public; Owner: developer
--

SELECT pg_catalog.setval('public.customers_id_seq', 12, true);


--
-- TOC entry 4878 (class 0 OID 0)
-- Dependencies: 217
-- Name: meal_dishes_meal_id_seq; Type: SEQUENCE SET; Schema: public; Owner: developer
--

SELECT pg_catalog.setval('public.meal_dishes_meal_id_seq', 1, false);


--
-- TOC entry 4879 (class 0 OID 0)
-- Dependencies: 219
-- Name: meals_id_seq; Type: SEQUENCE SET; Schema: public; Owner: developer
--

SELECT pg_catalog.setval('public.meals_id_seq', 12, true);


--
-- TOC entry 4880 (class 0 OID 0)
-- Dependencies: 221
-- Name: menu_id_seq; Type: SEQUENCE SET; Schema: public; Owner: developer
--

SELECT pg_catalog.setval('public.menu_id_seq', 2, true);


--
-- TOC entry 4881 (class 0 OID 0)
-- Dependencies: 223
-- Name: menu_items_id_seq; Type: SEQUENCE SET; Schema: public; Owner: developer
--

SELECT pg_catalog.setval('public.menu_items_id_seq', 2, true);


--
-- TOC entry 4882 (class 0 OID 0)
-- Dependencies: 225
-- Name: reff_staff_roles_code_seq; Type: SEQUENCE SET; Schema: public; Owner: developer
--

SELECT pg_catalog.setval('public.reff_staff_roles_code_seq', 5, true);


--
-- TOC entry 4883 (class 0 OID 0)
-- Dependencies: 227
-- Name: sales_id_seq; Type: SEQUENCE SET; Schema: public; Owner: developer
--

SELECT pg_catalog.setval('public.sales_id_seq', 10, true);


--
-- TOC entry 4884 (class 0 OID 0)
-- Dependencies: 229
-- Name: staff_id_seq; Type: SEQUENCE SET; Schema: public; Owner: developer
--

SELECT pg_catalog.setval('public.staff_id_seq', 1, true);


--
-- TOC entry 4682 (class 2606 OID 26747)
-- Name: customers Customers_pkey; Type: CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.customers
    ADD CONSTRAINT "Customers_pkey" PRIMARY KEY (id);


--
-- TOC entry 4686 (class 2606 OID 26749)
-- Name: meals Meals_pkey; Type: CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.meals
    ADD CONSTRAINT "Meals_pkey" PRIMARY KEY (id);


--
-- TOC entry 4688 (class 2606 OID 26751)
-- Name: menu Menú _pkey; Type: CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.menu
    ADD CONSTRAINT "Menú _pkey" PRIMARY KEY (id);


--
-- TOC entry 4690 (class 2606 OID 26753)
-- Name: menu_items Menú_Items_pkey; Type: CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.menu_items
    ADD CONSTRAINT "Menú_Items_pkey" PRIMARY KEY (id);


--
-- TOC entry 4692 (class 2606 OID 26755)
-- Name: reff_staff_roles Reff_Staff_Roles_pkey; Type: CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.reff_staff_roles
    ADD CONSTRAINT "Reff_Staff_Roles_pkey" PRIMARY KEY (code);


--
-- TOC entry 4696 (class 2606 OID 26757)
-- Name: staff Staff_pkey; Type: CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.staff
    ADD CONSTRAINT "Staff_pkey" PRIMARY KEY (id);


--
-- TOC entry 4678 (class 2606 OID 26758)
-- Name: menu check_Available_Date_To ; Type: CHECK CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE public.menu
    ADD CONSTRAINT "check_Available_Date_To " CHECK (((available_date_to > CURRENT_DATE) AND (available_date_to > CURRENT_DATE))) NOT VALID;


--
-- TOC entry 4679 (class 2606 OID 26759)
-- Name: staff check_first_name; Type: CHECK CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE public.staff
    ADD CONSTRAINT check_first_name CHECK (((first_name)::text ~ '^[^0-9]+$'::text)) NOT VALID;


--
-- TOC entry 4680 (class 2606 OID 26760)
-- Name: staff check_last_name; Type: CHECK CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE public.staff
    ADD CONSTRAINT check_last_name CHECK (((last_name)::text ~ '^[^0-9]+$'::text)) NOT VALID;


--
-- TOC entry 4684 (class 2606 OID 26705)
-- Name: meal_dishes meal_dishes_pkey; Type: CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.meal_dishes
    ADD CONSTRAINT meal_dishes_pkey PRIMARY KEY (meal_id);


--
-- TOC entry 4677 (class 2606 OID 26761)
-- Name: customers name; Type: CHECK CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE public.customers
    ADD CONSTRAINT name CHECK (((name)::text ~ '^[^0-9]+$'::text)) NOT VALID;


--
-- TOC entry 4694 (class 2606 OID 26763)
-- Name: sales sale_pkey; Type: CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.sales
    ADD CONSTRAINT sale_pkey PRIMARY KEY (id);


--
-- TOC entry 4698 (class 2606 OID 26764)
-- Name: meals customer_id; Type: FK CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.meals
    ADD CONSTRAINT customer_id FOREIGN KEY (customers_id) REFERENCES public.customers(id);


--
-- TOC entry 4701 (class 2606 OID 26769)
-- Name: sales id_Customer; Type: FK CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.sales
    ADD CONSTRAINT "id_Customer" FOREIGN KEY (id_customer) REFERENCES public.customers(id);


--
-- TOC entry 4702 (class 2606 OID 26774)
-- Name: sales id_Staff; Type: FK CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.sales
    ADD CONSTRAINT "id_Staff" FOREIGN KEY (id_staff) REFERENCES public.staff(id);


--
-- TOC entry 4697 (class 2606 OID 26779)
-- Name: meal_dishes item_id; Type: FK CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.meal_dishes
    ADD CONSTRAINT item_id FOREIGN KEY (item_id) REFERENCES public.menu_items(id);


--
-- TOC entry 4700 (class 2606 OID 26784)
-- Name: menu_items menu_id; Type: FK CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.menu_items
    ADD CONSTRAINT menu_id FOREIGN KEY (menu_id) REFERENCES public.menu(id);


--
-- TOC entry 4703 (class 2606 OID 26789)
-- Name: staff role_code; Type: FK CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.staff
    ADD CONSTRAINT role_code FOREIGN KEY (role_code) REFERENCES public.reff_staff_roles(code);


--
-- TOC entry 4699 (class 2606 OID 26794)
-- Name: meals staff_id; Type: FK CONSTRAINT; Schema: public; Owner: developer
--

ALTER TABLE ONLY public.meals
    ADD CONSTRAINT staff_id FOREIGN KEY (staff_id) REFERENCES public.staff(id);


-- Completed on 2024-10-07 20:19:11

--
-- PostgreSQL database dump complete
--

