CREATE TABLE IF NOT EXISTS public.customer
(
    id uuid NOT NULL,
    customer_name character varying(255) COLLATE pg_catalog."default" NOT NULL,
    customer_last_name character varying(255) COLLATE pg_catalog."default" NOT NULL,
    phone_number character varying(10) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT customer_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.customer
    OWNER to postgres;

INSERT INTO public.customer(
	id, customer_name, customer_last_name, phone_number)
	VALUES (gen_random_uuid(), 'Carlo', 'Fernando', '9177670600');

INSERT INTO public.customer(
	id, customer_name, customer_last_name, phone_number)
	VALUES (gen_random_uuid(), 'Krizia', 'Fernando', '9177679800');