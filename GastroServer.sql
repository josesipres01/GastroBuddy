PGDMP  %                	    |            GastroServer    16.4    16.4 J               0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    26691    GastroServer    DATABASE     �   CREATE DATABASE "GastroServer" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'Spanish_Mexico.1252';
    DROP DATABASE "GastroServer";
             	   developer    false                       0    0    DATABASE "GastroServer"    ACL     �   REVOKE ALL ON DATABASE "GastroServer" FROM developer;
GRANT CREATE,CONNECT ON DATABASE "GastroServer" TO developer;
GRANT TEMPORARY ON DATABASE "GastroServer" TO developer WITH GRANT OPTION;
                	   developer    false    4868                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
                pg_database_owner    false                       0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                   pg_database_owner    false    4            �            1259    26693 	   customers    TABLE     s   CREATE TABLE public.customers (
    id integer NOT NULL,
    name character varying NOT NULL,
    phone integer
);
    DROP TABLE public.customers;
       public         heap 	   developer    false    4            �            1259    26692    customers_id_seq    SEQUENCE     �   CREATE SEQUENCE public.customers_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 '   DROP SEQUENCE public.customers_id_seq;
       public       	   developer    false    216    4                       0    0    customers_id_seq    SEQUENCE OWNED BY     E   ALTER SEQUENCE public.customers_id_seq OWNED BY public.customers.id;
          public       	   developer    false    215            �            1259    26700    meal_dishes    TABLE        CREATE TABLE public.meal_dishes (
    meal_id integer NOT NULL,
    item_id integer NOT NULL,
    quantity integer NOT NULL
);
    DROP TABLE public.meal_dishes;
       public         heap 	   developer    false    4            �            1259    26699    meal_dishes_meal_id_seq    SEQUENCE     �   CREATE SEQUENCE public.meal_dishes_meal_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 .   DROP SEQUENCE public.meal_dishes_meal_id_seq;
       public       	   developer    false    4    218                       0    0    meal_dishes_meal_id_seq    SEQUENCE OWNED BY     S   ALTER SEQUENCE public.meal_dishes_meal_id_seq OWNED BY public.meal_dishes.meal_id;
          public       	   developer    false    217            �            1259    26707    meals    TABLE     �   CREATE TABLE public.meals (
    id integer NOT NULL,
    date_of_meal date NOT NULL,
    cost_of_meal double precision NOT NULL,
    customers_id integer NOT NULL,
    staff_id integer NOT NULL
);
    DROP TABLE public.meals;
       public         heap 	   developer    false    4            �            1259    26706    meals_id_seq    SEQUENCE     �   CREATE SEQUENCE public.meals_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.meals_id_seq;
       public       	   developer    false    220    4            	           0    0    meals_id_seq    SEQUENCE OWNED BY     =   ALTER SEQUENCE public.meals_id_seq OWNED BY public.meals.id;
          public       	   developer    false    219            �            1259    26712    menu    TABLE     �   CREATE TABLE public.menu (
    id integer NOT NULL,
    name character varying NOT NULL,
    available_date_from date,
    available_date_to date,
    type character varying NOT NULL,
    season character varying
);
    DROP TABLE public.menu;
       public         heap 	   developer    false    4            �            1259    26711    menu_id_seq    SEQUENCE     �   CREATE SEQUENCE public.menu_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 "   DROP SEQUENCE public.menu_id_seq;
       public       	   developer    false    4    222            
           0    0    menu_id_seq    SEQUENCE OWNED BY     ;   ALTER SEQUENCE public.menu_id_seq OWNED BY public.menu.id;
          public       	   developer    false    221            �            1259    26719 
   menu_items    TABLE     �   CREATE TABLE public.menu_items (
    id integer NOT NULL,
    menu_id integer NOT NULL,
    price double precision NOT NULL,
    name character varying NOT NULL,
    description character varying
);
    DROP TABLE public.menu_items;
       public         heap 	   developer    false    4            �            1259    26718    menu_items_id_seq    SEQUENCE     �   CREATE SEQUENCE public.menu_items_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE public.menu_items_id_seq;
       public       	   developer    false    4    224                       0    0    menu_items_id_seq    SEQUENCE OWNED BY     G   ALTER SEQUENCE public.menu_items_id_seq OWNED BY public.menu_items.id;
          public       	   developer    false    223            �            1259    26726    reff_staff_roles    TABLE     �   CREATE TABLE public.reff_staff_roles (
    code integer NOT NULL,
    role_name character varying NOT NULL,
    role_description character varying NOT NULL
);
 $   DROP TABLE public.reff_staff_roles;
       public         heap 	   developer    false    4            �            1259    26725    reff_staff_roles_code_seq    SEQUENCE     �   CREATE SEQUENCE public.reff_staff_roles_code_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 0   DROP SEQUENCE public.reff_staff_roles_code_seq;
       public       	   developer    false    4    226                       0    0    reff_staff_roles_code_seq    SEQUENCE OWNED BY     W   ALTER SEQUENCE public.reff_staff_roles_code_seq OWNED BY public.reff_staff_roles.code;
          public       	   developer    false    225            �            1259    26733    sales    TABLE     �   CREATE TABLE public.sales (
    id integer NOT NULL,
    amount double precision NOT NULL,
    id_meals integer NOT NULL,
    id_staff integer NOT NULL,
    id_customer integer NOT NULL,
    date_of_meal date NOT NULL
);
    DROP TABLE public.sales;
       public         heap 	   developer    false    4            �            1259    26732    sales_id_seq    SEQUENCE     �   CREATE SEQUENCE public.sales_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.sales_id_seq;
       public       	   developer    false    4    228                       0    0    sales_id_seq    SEQUENCE OWNED BY     =   ALTER SEQUENCE public.sales_id_seq OWNED BY public.sales.id;
          public       	   developer    false    227            �            1259    26738    staff    TABLE     �   CREATE TABLE public.staff (
    id integer NOT NULL,
    first_name character varying NOT NULL,
    last_name character varying NOT NULL,
    role_code integer NOT NULL
);
    DROP TABLE public.staff;
       public         heap 	   developer    false    4            �            1259    26737    staff_id_seq    SEQUENCE     �   CREATE SEQUENCE public.staff_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 #   DROP SEQUENCE public.staff_id_seq;
       public       	   developer    false    4    230                       0    0    staff_id_seq    SEQUENCE OWNED BY     =   ALTER SEQUENCE public.staff_id_seq OWNED BY public.staff.id;
          public       	   developer    false    229            =           2604    26696    customers id    DEFAULT     l   ALTER TABLE ONLY public.customers ALTER COLUMN id SET DEFAULT nextval('public.customers_id_seq'::regclass);
 ;   ALTER TABLE public.customers ALTER COLUMN id DROP DEFAULT;
       public       	   developer    false    216    215    216            >           2604    26703    meal_dishes meal_id    DEFAULT     z   ALTER TABLE ONLY public.meal_dishes ALTER COLUMN meal_id SET DEFAULT nextval('public.meal_dishes_meal_id_seq'::regclass);
 B   ALTER TABLE public.meal_dishes ALTER COLUMN meal_id DROP DEFAULT;
       public       	   developer    false    217    218    218            ?           2604    26744    meals id    DEFAULT     d   ALTER TABLE ONLY public.meals ALTER COLUMN id SET DEFAULT nextval('public.meals_id_seq'::regclass);
 7   ALTER TABLE public.meals ALTER COLUMN id DROP DEFAULT;
       public       	   developer    false    219    220    220            @           2604    26715    menu id    DEFAULT     b   ALTER TABLE ONLY public.menu ALTER COLUMN id SET DEFAULT nextval('public.menu_id_seq'::regclass);
 6   ALTER TABLE public.menu ALTER COLUMN id DROP DEFAULT;
       public       	   developer    false    221    222    222            A           2604    26722    menu_items id    DEFAULT     n   ALTER TABLE ONLY public.menu_items ALTER COLUMN id SET DEFAULT nextval('public.menu_items_id_seq'::regclass);
 <   ALTER TABLE public.menu_items ALTER COLUMN id DROP DEFAULT;
       public       	   developer    false    223    224    224            B           2604    26729    reff_staff_roles code    DEFAULT     ~   ALTER TABLE ONLY public.reff_staff_roles ALTER COLUMN code SET DEFAULT nextval('public.reff_staff_roles_code_seq'::regclass);
 D   ALTER TABLE public.reff_staff_roles ALTER COLUMN code DROP DEFAULT;
       public       	   developer    false    225    226    226            C           2604    26745    sales id    DEFAULT     d   ALTER TABLE ONLY public.sales ALTER COLUMN id SET DEFAULT nextval('public.sales_id_seq'::regclass);
 7   ALTER TABLE public.sales ALTER COLUMN id DROP DEFAULT;
       public       	   developer    false    227    228    228            D           2604    26741    staff id    DEFAULT     d   ALTER TABLE ONLY public.staff ALTER COLUMN id SET DEFAULT nextval('public.staff_id_seq'::regclass);
 7   ALTER TABLE public.staff ALTER COLUMN id DROP DEFAULT;
       public       	   developer    false    229    230    230            �          0    26693 	   customers 
   TABLE DATA                 public       	   developer    false    216   #P       �          0    26700    meal_dishes 
   TABLE DATA                 public       	   developer    false    218   �P       �          0    26707    meals 
   TABLE DATA                 public       	   developer    false    220   Q       �          0    26712    menu 
   TABLE DATA                 public       	   developer    false    222   +Q       �          0    26719 
   menu_items 
   TABLE DATA                 public       	   developer    false    224   �Q       �          0    26726    reff_staff_roles 
   TABLE DATA                 public       	   developer    false    226   �Q       �          0    26733    sales 
   TABLE DATA                 public       	   developer    false    228   ZR       �          0    26738    staff 
   TABLE DATA                 public       	   developer    false    230   �R                  0    0    customers_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.customers_id_seq', 12, true);
          public       	   developer    false    215                       0    0    meal_dishes_meal_id_seq    SEQUENCE SET     F   SELECT pg_catalog.setval('public.meal_dishes_meal_id_seq', 1, false);
          public       	   developer    false    217                       0    0    meals_id_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.meals_id_seq', 12, true);
          public       	   developer    false    219                       0    0    menu_id_seq    SEQUENCE SET     9   SELECT pg_catalog.setval('public.menu_id_seq', 2, true);
          public       	   developer    false    221                       0    0    menu_items_id_seq    SEQUENCE SET     ?   SELECT pg_catalog.setval('public.menu_items_id_seq', 2, true);
          public       	   developer    false    223                       0    0    reff_staff_roles_code_seq    SEQUENCE SET     G   SELECT pg_catalog.setval('public.reff_staff_roles_code_seq', 5, true);
          public       	   developer    false    225                       0    0    sales_id_seq    SEQUENCE SET     ;   SELECT pg_catalog.setval('public.sales_id_seq', 10, true);
          public       	   developer    false    227                       0    0    staff_id_seq    SEQUENCE SET     :   SELECT pg_catalog.setval('public.staff_id_seq', 1, true);
          public       	   developer    false    229            J           2606    26747    customers Customers_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public.customers
    ADD CONSTRAINT "Customers_pkey" PRIMARY KEY (id);
 D   ALTER TABLE ONLY public.customers DROP CONSTRAINT "Customers_pkey";
       public         	   developer    false    216            N           2606    26749    meals Meals_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.meals
    ADD CONSTRAINT "Meals_pkey" PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.meals DROP CONSTRAINT "Meals_pkey";
       public         	   developer    false    220            P           2606    26751    menu Menú _pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.menu
    ADD CONSTRAINT "Menú _pkey" PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.menu DROP CONSTRAINT "Menú _pkey";
       public         	   developer    false    222            R           2606    26753    menu_items Menú_Items_pkey 
   CONSTRAINT     [   ALTER TABLE ONLY public.menu_items
    ADD CONSTRAINT "Menú_Items_pkey" PRIMARY KEY (id);
 G   ALTER TABLE ONLY public.menu_items DROP CONSTRAINT "Menú_Items_pkey";
       public         	   developer    false    224            T           2606    26755 &   reff_staff_roles Reff_Staff_Roles_pkey 
   CONSTRAINT     h   ALTER TABLE ONLY public.reff_staff_roles
    ADD CONSTRAINT "Reff_Staff_Roles_pkey" PRIMARY KEY (code);
 R   ALTER TABLE ONLY public.reff_staff_roles DROP CONSTRAINT "Reff_Staff_Roles_pkey";
       public         	   developer    false    226            X           2606    26757    staff Staff_pkey 
   CONSTRAINT     P   ALTER TABLE ONLY public.staff
    ADD CONSTRAINT "Staff_pkey" PRIMARY KEY (id);
 <   ALTER TABLE ONLY public.staff DROP CONSTRAINT "Staff_pkey";
       public         	   developer    false    230            F           2606    26758    menu check_Available_Date_To     CHECK CONSTRAINT     �   ALTER TABLE public.menu
    ADD CONSTRAINT "check_Available_Date_To " CHECK (((available_date_to > CURRENT_DATE) AND (available_date_to > CURRENT_DATE))) NOT VALID;
 D   ALTER TABLE public.menu DROP CONSTRAINT "check_Available_Date_To ";
       public       	   developer    false    222    222            G           2606    26759    staff check_first_name    CHECK CONSTRAINT     y   ALTER TABLE public.staff
    ADD CONSTRAINT check_first_name CHECK (((first_name)::text ~ '^[^0-9]+$'::text)) NOT VALID;
 ;   ALTER TABLE public.staff DROP CONSTRAINT check_first_name;
       public       	   developer    false    230    230            H           2606    26760    staff check_last_name    CHECK CONSTRAINT     w   ALTER TABLE public.staff
    ADD CONSTRAINT check_last_name CHECK (((last_name)::text ~ '^[^0-9]+$'::text)) NOT VALID;
 :   ALTER TABLE public.staff DROP CONSTRAINT check_last_name;
       public       	   developer    false    230    230            L           2606    26705    meal_dishes meal_dishes_pkey 
   CONSTRAINT     _   ALTER TABLE ONLY public.meal_dishes
    ADD CONSTRAINT meal_dishes_pkey PRIMARY KEY (meal_id);
 F   ALTER TABLE ONLY public.meal_dishes DROP CONSTRAINT meal_dishes_pkey;
       public         	   developer    false    218            E           2606    26761    customers name    CHECK CONSTRAINT     k   ALTER TABLE public.customers
    ADD CONSTRAINT name CHECK (((name)::text ~ '^[^0-9]+$'::text)) NOT VALID;
 3   ALTER TABLE public.customers DROP CONSTRAINT name;
       public       	   developer    false    216    216            V           2606    26763    sales sale_pkey 
   CONSTRAINT     M   ALTER TABLE ONLY public.sales
    ADD CONSTRAINT sale_pkey PRIMARY KEY (id);
 9   ALTER TABLE ONLY public.sales DROP CONSTRAINT sale_pkey;
       public         	   developer    false    228            Z           2606    26764    meals customer_id    FK CONSTRAINT     y   ALTER TABLE ONLY public.meals
    ADD CONSTRAINT customer_id FOREIGN KEY (customers_id) REFERENCES public.customers(id);
 ;   ALTER TABLE ONLY public.meals DROP CONSTRAINT customer_id;
       public       	   developer    false    220    216    4682            ]           2606    26769    sales id_Customer    FK CONSTRAINT     z   ALTER TABLE ONLY public.sales
    ADD CONSTRAINT "id_Customer" FOREIGN KEY (id_customer) REFERENCES public.customers(id);
 =   ALTER TABLE ONLY public.sales DROP CONSTRAINT "id_Customer";
       public       	   developer    false    228    216    4682            ^           2606    26774    sales id_Staff    FK CONSTRAINT     p   ALTER TABLE ONLY public.sales
    ADD CONSTRAINT "id_Staff" FOREIGN KEY (id_staff) REFERENCES public.staff(id);
 :   ALTER TABLE ONLY public.sales DROP CONSTRAINT "id_Staff";
       public       	   developer    false    230    228    4696            Y           2606    26779    meal_dishes item_id    FK CONSTRAINT     w   ALTER TABLE ONLY public.meal_dishes
    ADD CONSTRAINT item_id FOREIGN KEY (item_id) REFERENCES public.menu_items(id);
 =   ALTER TABLE ONLY public.meal_dishes DROP CONSTRAINT item_id;
       public       	   developer    false    4690    224    218            \           2606    26784    menu_items menu_id    FK CONSTRAINT     p   ALTER TABLE ONLY public.menu_items
    ADD CONSTRAINT menu_id FOREIGN KEY (menu_id) REFERENCES public.menu(id);
 <   ALTER TABLE ONLY public.menu_items DROP CONSTRAINT menu_id;
       public       	   developer    false    4688    222    224            _           2606    26789    staff role_code    FK CONSTRAINT     }   ALTER TABLE ONLY public.staff
    ADD CONSTRAINT role_code FOREIGN KEY (role_code) REFERENCES public.reff_staff_roles(code);
 9   ALTER TABLE ONLY public.staff DROP CONSTRAINT role_code;
       public       	   developer    false    230    4692    226            [           2606    26794    meals staff_id    FK CONSTRAINT     n   ALTER TABLE ONLY public.meals
    ADD CONSTRAINT staff_id FOREIGN KEY (staff_id) REFERENCES public.staff(id);
 8   ALTER TABLE ONLY public.meals DROP CONSTRAINT staff_id;
       public       	   developer    false    4696    230    220            �   �   x���=�0�=��*�.NR����1tj#m���N]�q�=w���uv�w����X֜����z{v�Bӗ07- q��"l%�>�\L)�cX#�z���M�a�Ѕ21������獦<ni����H{\�
�B��f�      �   <   x���v
Q���W((M��L��MM̉O�,�H-Vs�	uV�0�Q0�Q04Ҵ��� ���      �   
   x���          �   X   x���v
Q���W((M��L��M�+Us�	uV�0�QP�	8''�9FF&����F�<#0�5��(1�̿$���|uMk... nm      �   N   x���v
Q���W((M��L��M�+��,I�-Vs�	uV�0�Q0�Q02�QPw�ONt��IT��R�R��5���� #iS      �   Y   x���v
Q���W((M��L�+JMK�/.I�E�9��
a�>���
�:
�ΉY�� :?�(Q]Ӛ˓��}S�S���a�T�!\\ ��)�      �   R   x���v
Q���W((M��L�+N�I-Vs�	uVа�Q04bR7202�54�50S״��$���@G����	� �� ���      �   ?   x���v
Q���W((M��L�+.ILKSs�	uV�0�QP�*M�S���%�@�HӚ�� �     